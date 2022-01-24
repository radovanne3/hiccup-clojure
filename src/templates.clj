(ns templates
  (:require [hiccup.page :refer :all]))

(def prti-bee-gee-5+1-album [{:pesma "Gram ujutru"
                              :url "https://www.youtube.com/watch?v=QHJWv5R5RYk&list=PLTRCoBfm4cm253zSpKxJzzVYa_BkILFJM"}
                             {:pesma "Muri me jurija"
                              :url "https://www.youtube.com/watch?v=F3UPgGWwZx4&list=PLTRCoBfm4cm253zSpKxJzzVYa_BkILFJM&index=2"}
                             {:pesma "Najjaci u kraju"
                              :url "https://www.youtube.com/watch?v=fPlyfPH_25A&list=PLTRCoBfm4cm253zSpKxJzzVYa_BkILFJM&index=3"}
                             {:pesma "20cm madjije"
                              :url "https://www.youtube.com/watch?v=0C8y8S8txzQ&list=PLTRCoBfm4cm253zSpKxJzzVYa_BkILFJM&index=5"}
                             {:pesma "Tai masaza"
                              :url "https://www.youtube.com/watch?v=tK5q5g115XU&list=PLTRCoBfm4cm253zSpKxJzzVYa_BkILFJM&index=7"}
                             {:pesma "Avakari"
                              :url "https://www.youtube.com/watch?v=bFBdwpdKD4o&list=OLAK5uy_l3oTVzc50vH7pRbXM16m2M9eGHuiprxGw&index=13"}])


(defn pocetna-strana
  "A song to wish you goodbye"
  [req]
  (html5 {:lang "en"}
         [:head (include-css "mystyle.css")]
         [:body
          [:div [:h1 {:class "info"} "HOMEPAGE"]]
          [:div [:p "Walking back to happiness with you"]]
          [:div [:p "Said, Farewell to loneliness I knew"]]
          [:div [:p "Laid aside foolish pride"]]
          [:div [:p "Learnt the truth from tears I cried"]]]))


(defn mjuza
  "A song to wish you goodbye"
  [req]
  (html5 {:lang "en"}
         [:head]
         [:body
          [:div {:style {:display "grid"
                         :grid-gap 50
                         :grid-template-columns "auto"
                         :padding 10}} [:h1 "Prti Bee Gee 5+1"] (map (fn [x]
                       [:div {
                              :style {:text-align "center"
                                      :font-size 30
                                      :padding 20
                                      :border "1px solid rgba(0, 0, 0, 0.8)"}
                              } [:h1 (:pesma x)] [:iframe {:style {:height "auto"} :src (:url x)}]]
                       ) prti-bee-gee-5+1-album)]
          ]))



