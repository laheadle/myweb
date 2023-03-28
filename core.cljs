(ns static-web.core
  (:require [reagent.core :as r]
            [reagent.dom :as dom]
            [clojure.string :as string]
            ;; [cljs.pprint :refer [pprint]]
            ))

(defn line-one []
  [:h1 [:span.english "You are invited!"] [:span.sep "/"] [:span.spanish "¡Estás invitado!"]])
(defn line-two []
  [:h1 [:span.english "To Hal's Birthday Party!"] [:span.sep "/"] [:span.spanish "¡A la fiesta de cumpleaños de Hal!"]])
(defn line-three []
  [:h1 [:span.english "See you there!"] [:span.sep "/"] [:span.spanish "¡Alli nos vemos!"]])
(defn description []
  [:h1 [:span.english "Bowling, Games!"] [:span.sep "/"] [:span.spanish "¡Bolos, Juegos!"]])

(defn home []
  [:div.invitation
   [line-one]
   [line-two]
   [description]
   [:h1 [:span.english "Are You Coming? Tell Us!"] [:span.sep "/"] [:span.spanish "Vas a Ir? ¡Dinos!"]]
   [:div.contact "laheadle@gmail.com (919 391-0185)"]
   [line-three]
   [:div.place
    [:div "April 16th, 2023, 11am-2pm" [:span.sep "/"] "El 16 de Abril, 2023, 11am-2pm"]
    [:div "Penny Lanes"]
    [:div "1140 Parkside Main St"]
    [:div "Cary, NC 27519"]]])


(dom/render [home] (.getElementById js/document "content"))