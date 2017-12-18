(defproject excel-to-json "0.1.2-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.apache.poi/poi "3.14"]
                 [org.apache.poi/poi-ooxml "3.14"]
                 [org.clojure/core.async "0.1.267.0-0d7780-alpha"]
                 [org.clojure/tools.cli "0.3.1"]
                 [cheshire "5.3.1"]
                 [myguidingstar/clansi "1.3.0"]
                 [fswatch "0.2.0-SNAPSHOT"]
                 [org.flatland/ordered "1.5.2"]
                 [seesaw "1.4.4"]
                 [org.clojure/core.match "0.2.1"]]
  :plugins [[lein-marginalia "0.7.1"]
            [lein-git-deps "0.0.1-SNAPSHOT"]]
  :profiles {:uberjar {:aot :all}
             :dev {:source-paths ["dev"]
                   :resource-paths ["test-resources"]
                   :plugins [[lein-cloverage "1.0.2"]]
                   :dependencies [[org.clojure/tools.namespace "0.2.4"]]
                   :global-vars {*print-length* 20}}
             :test {:resource-paths ["test-resources"]}}
  :main excel-to-json.core)
