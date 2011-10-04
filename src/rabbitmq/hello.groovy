/*
 * src/rabbitmq/hello.groovy
 */

@Grab('com.rabbitmq:amqp-client:2.6.1+')

import com.rabbitmq.client.*

ConnectionFactory factory = new ConnectionFactory();
factory.setHost("localhost");
Connection connection = factory.newConnection();
Channel channel = connection.createChannel();

channel.queueDeclare("HELLO", false, false, false, null);
String message = "Hello, RabbitMQ!";
channel.basicPublish("", "HELLO", null, message.getBytes());
System.out.println(" [x] Sent '" + message + "'");

