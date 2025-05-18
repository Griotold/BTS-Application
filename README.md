# BTS Member Gallery App
![BTS_메인](https://github.com/user-attachments/assets/ccaef470-05f6-482f-a47f-91dcb656036b)

![BTS_이미지클릭시_확대](https://github.com/user-attachments/assets/45327845-0385-4df0-b9dc-deb653b0ef83)


---

## 소개

**BTS Member Gallery**는 BTS 멤버들의 이미지를 한 화면에 보여주고,  
각 이미지를 클릭하면 해당 멤버의 사진이 크게 보이는 간단한 안드로이드 앱입니다.  
이미지 클릭 시 Toast 메시지가 표시되고, Intent를 통해 확대 화면으로 이동합니다.

---

## 주요 기능

- BTS 멤버 이미지 갤러리 제공
- 이미지 클릭 시 Toast 메시지 출력
- 클릭한 이미지를 크게 보여주는 화면으로 전환

---

## 앱 화면

- **메인화면:** 여러 멤버의 이미지가 그리드 형태로 배치되어 있습니다.
- **확대화면:** 이미지를 클릭하면 해당 멤버의 사진이 크게 표시됩니다.

---

## 사용 기술

- **언어:** Kotlin
- **플랫폼:** Android
- **UI:** ConstraintLayout, ImageView
- **기능:** Toast, Intent, Activity 전환

---

## 코드 예시

```kotlin
val image1 = findViewById<ImageView>(R.id.bts_image_1)
image1.setOnClickListener {
  Toast.makeText(this, "1번 클릭 완료", Toast.LENGTH_SHORT).show()
  val intent = Intent(this, Bts1Activity::class.java)
  startActivity(intent)
}
```

- **Toast**: 짧은 안내 메시지를 화면 하단에 띄웁니다.
- **Intent**: 클릭 시 다른 화면(Activity)으로 전환합니다.

---

## 학습 포인트

- Toast로 사용자 피드백 제공
- Intent를 통한 화면(Activity) 전환
- 여러 ImageView에 클릭 리스너 적용

---

## 실행 방법

1. 레포지토리를 클론한 후 Android Studio에서 엽니다.
2. 실제 디바이스 또는 에뮬레이터에서 실행합니다.
3. 메인 화면에서 이미지를 클릭하면 Toast 메시지가 뜨고,  
   클릭한 이미지를 크게 볼 수 있는 화면으로 이동합니다.

---

**처음 만든 안드로이드 앱으로, 이미지 클릭/확대, Toast, Intent 등 기초 기능을 구현해보았습니다.**

# References
[왕초보편] 앱 8개를 만들면서 배우는 안드로이드 코틀린(Android Kotlin)
https://www.inflearn.com/course/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C-%EC%BD%94%ED%8B%80%EB%A6%B0-%EB%AA%A8%EB%B0%94%EC%9D%BC%EC%95%B1
