(defproject firewarn "0.1.0"
  :description "Firewarn "
  :url "http://example.com/FIXME"
  :license
  {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
   :url  "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [http-kit "2.2.0"]
                 [javax.xml.bind/jaxb-api "2.3.1"]
                 [clj-time "0.14.0"]
                 [compojure "1.6.0"]]
  :plugins [[lein-cljfmt "0.6.4"]]
  :repl-options {:init-ns firewarn.core}
  :main firewarn.core)
