### <center>[JDK 27 API Documentation](https://docs.oracle.com/en/java/javase/27/docs/api/index.html)</center>

### <center>[JDK 25 API Documentation](https://docs.oracle.com/en/java/javase/25/docs/api/index.html)</center>

### <center>[JDK 23 API Documentation](https://docs.oracle.com/en/java/javase/23/docs/api/index.html)</center>

### <center>[JDK 21 API Documentation](https://docs.oracle.com/en/java/javase/21/docs/api/index.html)</center>

### <center>[JDK 11 API Documentation](https://docs.oracle.com/en/java/javase/11/docs/api/)</center>

### <center>[JDK 8 API Documentation](https://docs.oracle.com/javase/8/docs/api/)</center>

## 專案結構

這是一個使用 Java 21 的單一 Maven 練習專案。Java 程式統一放在
`com.java.learn` 根套件下，並按照學習主題分類：

| 套件 | 內容 |
| --- | --- |
| `algorithms` | 搜尋、排序、遞迴、圖、樹、鏈結串列與題目練習 |
| `basics` | 字串、日期、例外、正規表示式及物件導向基礎 |
| `collections` | List、Set、Map、Iterator 與 Collections API |
| `concurrency` | Thread、Runnable、Callable、Future 與執行緒池 |
| `functional` | Lambda、方法參照與 Stream API |
| `io` | 檔案、串流、序列化、ZIP 與 Properties |
| `networking` | UDP 通訊與網路爬蟲練習 |
| `reflection` | Java Reflection 練習 |
| `exercises` | 一般語法與獨立題目 |
| `projects` | Poker、Baha 與註冊功能等小型整合練習 |

正式的 JUnit 測試放在 `src/test/java`。可以使用以下指令執行測試：

```shell
./mvnw test
```
