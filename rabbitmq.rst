RabbitMQ
========

安裝 RabbitMQ
--------------

Ubuntu Linux
^^^^^^^^^^^^^

使用 apt 安裝 ::

	sudo apt-get update
	sudo apt-get install rabbitmq-server

啟動 ::

	sudo service rabbitmq-server stop
	sudo service rabbitmq-server start

Mac OS X
^^^^^^^^^

使用 port 安裝 ::

	sudo port -d sync
	sudo port install rabbitmq-server

Hello, RabbitMQ
----------------

.. literalinclude:: src/rabbitmq/hello.groovy
   :language: groovy


