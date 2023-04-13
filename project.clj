(defproject yetibot/parent "_"
  :description "Parent properties for Yeibot plugins"
  :url "https://github.com/yetibot/parent"
  :scm {:name "git" :url "https://github.com/yetibot/parent"}
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [yetibot/core "20230329.232328.17468b5"]]

  :repl-options {:init-ns yetibot.core.repl
                 :timeout 120000
                 :prompt (fn [ns] (str "\u001B[35m[\u001B[34m" ns
                                       "\u001B[35m] \u001B[37mλ:\u001B[m "))
                 :welcome
                 (do
                   (println)
                   (println
                     (str
                       "\u001B[37m"
                       "  Welcome to the Yetibot dev REPL!"
                       \newline
                       "  Use \u001B[35m(\u001B[34mhelp\u001B[35m) "
                       "\u001B[37mto see available commands."
                       \newline
                       \newline
                       "\u001B[35m    λλλ"
                       "\u001B[m"))
                   (println))}


  :plugins [[lein-inferv "20201020.015531.74d2ced"]
            [lein-environ "1.1.0"]
            [lein-midje "3.2.1"]]


  :deploy-repositories [["releases" {:url "https://clojars.org/repo"
                                     :username :env/clojars_username
                                     :password :env/clojars_password
                                     :sign-releases false}]]

  :profiles
  {:profiles/dev {}
   :dev [:profiles/dev
         {:dependencies [[lambdaisland/kaocha-midje "0.0-5"
                          :exclusions [midje/midje]]
                         [midje/midje "1.9.6"]]}]})
