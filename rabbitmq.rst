RabbitMQ
========

安裝 RabbitMQ
--------------

Ubuntu Linux
^^^^^^^^^^^^^

使用 apt 安裝： ::

	sudo apt-get update
	sudo apt-get install rabbitmq-server

若 Ubuntu 的版本較舊（例如：10.04），
可以使用 RabbitMQ 提供的 apt repository 安裝。 ::

	sudosh -c "echo 'deb http://www.rabbitmq.com/debian/ testing main' > /etc/apt/sources.list.d/rabbitmq.list"
	wget -q http://www.rabbitmq.com/rabbitmq-signing-key-public.asc -O- | sudo apt-key add -
	sudo apt-get update
	sudo apt-get install rabbitmq-server

通常在安裝後，系統就會自動啟動 RabbitMQ 服務，但您也可以手動以指令啟動： ::

	sudo service rabbitmq-server start

或重新啟動、停止： ::

	sudo service rabbitmq-server restart
	sudo service rabbitmq-server stop

Mac OS X
^^^^^^^^^

使用 port 安裝： ::

	sudo port -d sync
	sudo port install rabbitmq-server

啟動： ::

	sudo rabbitmq-server &


Hello, RabbitMQ
----------------

RabbitMQ 提供一組 Java AMQP client [#JavaAMQPClient]_ 函式庫，
在 Groovy 程式碼中，
只要以 Grape 的 @Grab 標記宣告即可使用。 ::

	@Grab('com.rabbitmq:amqp-client:2.6.1')

.. [#JavaAMQPClient] http://www.rabbitmq.com/java-client.html

以下是「Hello, RabbitMQ」範例程式碼，展示簡易的 Sending / Receiving 動作如何完成。

.. literalinclude:: src/rabbitmq/hello.groovy
   :language: groovy
   :linenos:
   :emphasize-lines: 5


