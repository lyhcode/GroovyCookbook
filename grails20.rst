Grails 敏捷網站開發（2.0）
=======================

Grails 目前最新的開發中版本是 2.0.2M2，
尚未正式發行，
但功能有許多變動，
若是規模不大的新專案，
可以考慮採用此版本。

安裝 Grails 2.0.x
-----------------

Mac OS X
^^^^^^^^^

Install 2.0.0.M2 (milestone release)

::

	port install grails-devel

建立 Grails 專案
----------------

建立一個新專案： ::

	grails create-app hello

切換到專案目錄下： ::

	cd hello

執行 grails 指令 [#GrailsInteractive]_ ，
進入交談模式，
出現 **grails>** 提示： ::

	$ grails
	| Enter a script name to run. Use TAB for completion: 
	grails> 


.. [#GrailsInteractive] 舊版需要輸入 grails interactive 指令，但是在 2.0 只需要輸入 grails 即可。

執行 run-app 指令，啟動應用程式： ::

	grails> run-app
	| Server running. Browse to http://localhost:8080/hello
	| Application loaded in interactive mode. Type 'exit' to shutdown.
	| Enter a script name to run. Use TAB for completion: 

用瀏覽器打開網址： ::

	http://localhost:8080/hello

輸入 exit 結束，結束應用程式： ::

	grails> exit
	| Stopping Grails server

再輸入一次 exit 就可以離開 grails 交談模式。

您也可以使用系統的 Shell 操作 grails 指令，而不透過交談模式，例如： ::

	grails run-app

雖然效果相同，
但由於每次執行指令，
都必須耗費不少載入時間，
因此使用交談模式，
可以加快 grails 的指令操作、減少等待。

