(defproject ecommerce "0.1.0-SNAPSHOT"
            :description "Ecommerce with Datomic"
            :dependencies [[org.clojure/clojure "1.11.1"]
                           [com.datomic/datomic-pro "1.0.6711"]
                           [ch.qos.logback/logback-classic "1.2.3"]]
            :source-paths ["src"]
            :resource-paths ["resources"]
            :test-paths ["test"]
            :repl-options {:init-ns ecommerce.core}
            :repositories [["datomic-pro" {:url "https://my.datomic.com/repo"}]])
