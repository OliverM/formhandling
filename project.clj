(defproject formhandling "0.1.0-SNAPSHOT"
  :description "Testing various data validation libraries for handling user-submitted data via HTML forms."
  :url "https://github.com/OliverM/formhandling"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [examine "1.2.1"]
                 [bouncer "1.0.0"]
                 ]
  :main ^:skip-aot formhandling.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
