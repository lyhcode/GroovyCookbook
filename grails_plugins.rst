Grails 擴充功能介紹
==================

RabbitMQ
---------

安裝： ::

	grails install-plugin rabbitmq

設定（grails-app/conf/Config.groovy）： ::

	// RabbitMQ configuration
	rabbitmq {
	    connectionfactory {
	        username = 'guest'
	        password = 'guest'
	        hostname = 'localhost'
	        consumers = 5
	    }
	 
	    queues = {
	        msgs()
	    }
	}