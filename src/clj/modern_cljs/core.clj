(ns modern-cljs.core
  (:require [compojure.core :refer [defroutes GET POST]]
            [compojure.route :refer [resources not-found]]
            [compojure.handler :refer [site]]
            [modern-cljs.login :refer [authenticate-user]]))

(defroutes app-routes
  (GET "/" [] "<p>Hola</p>")
  (POST "/login" [email password] (authenticate-user email password))
  (resources "/")
  (not-found "Page not found el hombre"))

(def handler
  (site app-routes))
