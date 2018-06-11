作者:電機109林倚丞
學號:E24056051

程式檔案名稱:hw5.java(主程式)
             wizard.java
             magic.java
              
使用說明:
1.將run_cmd與hw5至於相同資料夾
2.開啟run_cmd
3.輸入javac -encoding utf-8 magic.java
4.按Enter
5.輸入javac -encoding utf-8 wizard.java
6.按Enter
7.輸入javac -encoding utf-8 tool.java
8.按Enter
9.輸入javac -encoding utf-8 hw4.java
10.按Enter
11.輸入java hw5
12.按Enter即可
13.遊戲說明
本遊戲由兩人對決所構成
開始時兩人輪流輸入自己的巫師名稱與所選學校，學校會造成不同的初始能力值。
例如(Harry Griffendor)

輸入完畢後，雙方各自輸入指令進行對戰
每回合可選擇四件事得其中一件進行，也可輸入do nothing選擇什麼也不做

輸入方法為attack 咒語(example:attack Stupefy)
每種咒語皆須學習後才可使用
咒語可重複學習直到熟練度提升到百分之百
輸入方法為learn 咒語(example:learn Stupefy)

也可輸入use 咒語(example:use Elder Wand)
使用道具，可獲得不同加乘效果

也可選擇使用魔藥回復體力50點
輸入recover即可



若玩家想結束遊戲
可輸入gameover

遊戲會結算體力值
體力值較高者獲勝

若有一方玩家體力歸零
另一方玩家獲勝
遊戲結束