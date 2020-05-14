(defproject tme-solo-2016 "0.0.1-SNAPSHOT"
  :description "TME Solo -- 2016/2017"
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :profiles {:dev {:dependencies [[midje "1.9.6" :exclusions [org.clojure/clojure]]]
                   :plugins [[lein-midje "3.2.1"]]}})
