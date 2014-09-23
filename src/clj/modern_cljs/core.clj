(ns modern-cljs.core
  (:require [compojure.handler :as handler]
            [compojure.core :refer [defroutes GET]]
            [compojure.route :as route]))

(defroutes app-routes
  (GET "/" [] "<p>Hola</p>")

  (route/resources "/")
  (route/not-found "Page not found el hombre"))

(def handler
  (handler/site app-routes))
