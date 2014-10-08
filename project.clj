(defproject swift-wife "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :javac-options ["-target" "1.8" "-source" "1.8" "-Xlint:-options"]
  ;:jar-name "swift-wife.jar"
  ;:uberjar-name "swift-wife-all.jar"
  :profiles {:dev        
                            {
                               :dependencies [
                               [org.clojure/clojure "1.6.0"]
                               [com.aphyr/prism "0.1.1"]
                               ]
                               :plugins      [
                               [com.aphyr/prism "0.1.1"]]                                  
                            }                      
                       }     
  :java-source-paths ["src"] 
  :dependencies [
  	[commons-lang/commons-lang "2.6"]
  	[rhino/js "1.7R2"]
   ])
