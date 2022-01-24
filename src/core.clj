(ns core
  (:require [org.httpkit.server :as server]
            [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer :all]
            [clojure.pprint :as pp]
            [clojure.string :as str]
            [templates :refer :all]
            )
  (:gen-class))


(defroutes hiccup-routes
           (GET "/" [] templates/pocetna-strana)
           (GET "/mjuza" [] templates/mjuza)
           (route/not-found "Error, page not found!"))

(defn -main
  "This is entry point function which will light up our server.."
  [& args]
  (let [port (Integer/parseInt (or (System/getenv "PORT") "3000"))]
    ;; Run server with Ring.defaults middleware
    (server/run-server (wrap-defaults #'hiccup-routes site-defaults)
                       {:port port})
    (println (str "We are up and runnin at http:/127.0.0.1:" port "/"))))