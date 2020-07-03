# neo4j-concurrency
由程式確保每筆交易的同步性，連接至圖形化資料庫

## 環境安裝

* 在官方下載 https://neo4j.com/download/ 所需之community server
  * 放置到C:或其他位置
  * 將其資料夾之.\bin位置新增至環境設置PATH中
  
* 開啟cmd執行

```
cd C:\你的資料夾\bin
```

* 成功轉換到資料夾下後，輸入指令:

```
neo4j install-service
```

* 安裝完成後，輸入指令:

```
neo4j start
```

* 啟用成功後，即可在瀏覽器中輸入 http://localhost:7474 進入伺服器管理頁面


## IDE中設置

* 在IDE中建立Maven Project，在其中的pom.xml檔中加入以下指令，即可自動下載需要的jar檔:( **版本由自己控制**)

```
<dependencies>
    <!-- https://mvnrepository.com/artifact/org.neo4j.driver/neo4j-java-driver -->
    <dependency>
        <groupId>org.neo4j.driver</groupId>
        <artifactId>neo4j-java-driver</artifactId>
        <version>4.0.1</version>
    </dependency>
    
    <!-- https://mvnrepository.com/artifact/org.neo4j/neo4j -->
    <dependency>
        <groupId>org.neo4j</groupId>
        <artifactId>neo4j</artifactId>
        <version>4.0.1</version>
    </dependency>
</dependencies>
```

