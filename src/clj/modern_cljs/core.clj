(ns modern-cljs.core
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defroutes app-routes
  (GET "/" [] "<p>Hola</p>")

  (route/resources "/")
  (route/not-found "Page not found el hombre"))

(def handler
  (handler/site app-routes))
