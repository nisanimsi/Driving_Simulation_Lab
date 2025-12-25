# 🏎️ Professional Driving Simulation Lab

Bu proje, **Amazon Junior Software Developer Specialization** müfredatı kapsamında, bir aracın vites, hız ve motor kontrol sistemlerini simüle etmek için tasarlanmıştır.



## 🏗️ Mimari ve Yazılım Prensipleri
Bu çalışmada, basit bir simülasyonun ötesine geçilerek kurumsal yazılım standartları uygulanmıştır:

* **Encapsulation (Kapsülleme):** Aracın iç durumu (`speed`, `gear`, `engineStatus`) `private` olarak tanımlanmıştır. Veri manipülasyonu sadece önceden tanımlanmış kurallara (metodlara) göre yapılabilir.
* **Modülerlik:** Kullanıcı etkileşimi (`Main.java`) ve araç fiziği/mantığı (`Car.java`) birbirinden ayrı sınıflara bölünmüştür.
* **Input Validation:** `try-catch` blokları kullanılarak kullanıcı hatalarına karşı dayanıklı (robust) bir yapı kurulmuştur.

---

## 🎓 C, C++, C# Geçmişinden Java'ya
Bu simülasyonu geliştirirken 1. sınıfta edindiğim temel dillerin prensiplerini uyguladım:
* **C:** Karar yapıları (`switch-case`) ve temel veri yönetimi.
* **C++:** Nesne yönelimli düşüncenin temelleri ve sınıf (class) hiyerarşisi.
* **C#:** Modern hata yönetimi (Exception Handling) ve kullanıcı deneyimi tasarımı.

---

## 🛠️ Simülasyon Kuralları
- Araç **Park (P)** modundayken hızlanamaz.
- Motor kapalıyken vites değiştirilemez.
- Motor kapatıldığında güvenlik amacıyla vites otomatik olarak **Park (P)** konumuna geçer ve hız sıfırlanır.

## 🚀 Nasıl Çalıştırılır?
```bash
javac *.java
java Main
