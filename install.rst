安裝 Groovy
============

Ubuntu Linux
-------------

Ubuntu 的套件庫已提供 Groovy，
可以使用 apt-get 指令安裝。 ::

    sudo apt-get update
	sudo apt-get install groovy

但是 Groovy 目前的版本更新速度相當快，
Ubuntu 套件庫提供的 Groovy 通常是比較舊的版本，
建議從 Launchpad PPA 安裝最新版本。 ::

	sudo apt-add-repository ppa:groovy-dev/groovy
	sudo apt-get update
	sudo apt-get install groovy-1.8
