# 💻 Coding Test Tips & Tricks

Welcome to my repository! Here are some handy tips and notes for coding tests. 🚀

---

## 📌 Java Tips

### 1️⃣ `String.split("")` 반환형
- **`split("")`** 메서드는 문자열을 빈 문자열 기준으로 분리합니다.
- **반환값**: `String[]` (문자열 배열)
  
```java
String text = "hello";
String[] result = text.split("");
System.out.println(Arrays.toString(result)); 
// 출력: [, h, e, l, l, o]
