(defproject reagent-hooks "0.1.0"
  :description "Collection of reagent hooks "
  :url "https://github.com/victorvoid/reagent-hooks"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :clojurescript? true

  :plugins [[lein-codox "0.9.1"]
            [lein-cljsbuild "1.1.1"]]

  :codox {:language :clojurescript
          :exclude  clojure.string}

  :profiles {:dev
             {:dependencies [[org.clojure/clojure "1.7.0"]
                             [org.clojure/clojurescript "1.7.170"]
                             [reagent "0.7.0"]]
              :plugins      [[lein-doo "0.1.7"]]}})
