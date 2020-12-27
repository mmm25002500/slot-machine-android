# Slot-Machine Game 老虎機777遊戲
這是一款使用Java寫的Android Game，可以猜運氣，目前也正在維護中，也有在定時更新。
目前功能:
777老虎機
目前只有水果～～
[![Build Status](http://img.shields.io/travis/badges/badgerbadgerbadger.svg?style=flat-square)](https://travis-ci.org/badges/badgerbadgerbadger)

## 如何編譯 How to Compile
由於Android-Studio 或是其他IDE已將javac內含至此，所以只須執行就會自動編譯並執行。
### 編譯 Compile:

**Step 1.**``git clone https://github.com/mmm25002500/slot-machine-android   ``

**Step 2.** 打開Android-Studio

**Step 3.** 打開專案 Open Project

Step 4.Run

### 安裝 Install:

``adb install release.apk``

### 心得與建構思路:
此專案是我在上課時聽從老師講解而想到的遊戲,就是在 Appinventor 上進行練習編寫,
由於我會 Java,因此我自學用 Android SDK 在 Java 上編寫 APP,在這路上遇到很多坑與挫
折,不過由於我自學能力強,會自己 Google。
這個專案就是在 activity_main 上先寫出三個 ImageView 和一個 Button 還有一個 TextView
用來存放是否贏了或是輸了的值,然後在 MainActivity 裡面先宣告此物件與全域陣列名為
resource 是放入三個圖片的 id,在 onCreate 先把這三個 ImageView 給初始化並手動指定
image ,我也使用 getSupportActionBar() 方法將 Title 設定完成就不會出現預設名字的
Title,然後在 onClickPlay 承接 Button 一旦點擊的方法,一旦點擊就會宣告三個隨機整數,
介於 0~2,由於 Java 陣列是從 0 開始,三張圖片就是 Index[0,1,2] 分別是 r1,r2,r3,內容是
圖片的 ID,然後放到 ImageView 裡面,就可以做到亂數隨機放入圖片,在增加一個 if 判斷
結構,如果 r1 是 r2 是 r3 那麼設定文字顏色為-65536(紅色),也就是三張一樣文字會是紅色
並且顯示「You Win!! 你得到三個蘋果...」,如果都不是就是設定顏色為-16777216(黑色)並
且 setText(“You Lose”),意謂你輸了!
另外在 activity_main.xml 中我將三個 ImageView 的 layout_constraint..設定為前一個圖片
與後一個圖片,如此一來就可以達到三張平均分配顯示,就不會看起來歪一邊,另外我在
activity_main.xml 中設定 android:background=”#05FFCD”,也就是青色,才不會怪怪的。

## 關於我們 About Us

[Team Website](www.tershi.ml) <br>
[Team Facebook](https://www.facebook.com/shanling.team/) <br>
[XiaTerShi YouTube](https://www.youtube.com/channel/UCPdpFDFOp3sPbZhRkaQVaQA) <br>
[XiaTerShi FaceBook](https://www.facebook.com/Tershi25648) <br>
[Tershi MailServer](https://mail.tershi.ml) <br>
[Tershi Official WebSite](https://official.tershi.ml) <br>
[Tershi Gitbook](https://gitbook.tershi.ml) <br>
以上關於因為域名為免費域(無法使用信用卡申請(未滿18)) 因此隨時會網域更換！ <br>
Licence:© Tershi 2020 All right reversed 此程式除了「關於」頁面不可重製及發布之外，其餘頁面及功能可進行重製發布。
