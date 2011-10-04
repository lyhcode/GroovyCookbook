/*
 * src/rabbitmq/hello.groovy
 */

@Grab('com.rabbitmq:amqp-client:2.6.1')

import com.rabbitmq.client.*

factory = new ConnectionFactory()
factory.host = 'localhost'
connection = factory.newConnection()
channel = connection.createChannel()

channel.queueDeclare('HELLO_QUEUE', false, false, false, null)

//Sending
message = 'Hello, RabbitMQ!'
channel.basicPublish('', 'HELLO_QUEUE', null, message.bytes)
println(" [x] Sent '$message'")

//Receiving
consumer = new QueueingConsumer(channel)
channel.basicConsume('HELLO_QUEUE', true, consumer)
delivery = consumer.nextDelivery()
message = new String(delivery.body)
println(" [x] Received '$message'")

channel.close()
connection.close()
