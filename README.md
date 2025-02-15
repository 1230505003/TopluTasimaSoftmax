


# 🚍 Toplu Taşıma Güzergah Belirleme  

Bu proje, farklı mahalleler için belirlenen kriterlere göre en uygun güzergahı seçmek amacıyla **Softmax Fonksiyonu** ve **Ağırlıklı Skorlama** yöntemlerini kullanmaktadır.  

## 📌 Özellikler  
- **Softmax Fonksiyonu** ile kriterlerin ağırlıkları hesaplanır.  
- **Ağırlıklı Skorlama** yöntemi ile mahallelerin puanı belirlenir.  
- En yüksek skora sahip mahalle, en uygun güzergah olarak seçilir.  

## 📂 Dosya Açıklamaları  
- `TopluTasima.java`: Ana kod dosyası. Softmax hesaplaması ve güzergah seçim algoritması burada bulunur.  

## 📜 Kullanım  
Projeyi çalıştırmak için aşağıdaki adımları takip edin:  

1. **Projeyi klonlayın:**  
   ```bash
   git clone https://github.com/kullaniciAdi/TopluTasima.git
   cd TopluTasima
   ```
2. **Java derleyicisi ile çalıştırın:**  
   ```bash
   javac TopluTasima.java
   java TopluTasima
   ```  

## 🔍 Kod Açıklamaları  
### 🧮 Softmax Fonksiyonu  
Bu fonksiyon, verilen kriterlerin üstel değerlerini alarak toplam üstel değere bölmektedir.  
```java
public static double[] softmax(double [] sartlar) { ... }
```  
### 📊 Ağırlıklı Skor Hesaplama  
Bu fonksiyon, mahalle verilerini ağırlıklarla çarparak toplam skorları hesaplar.  
```java
public static double hesapla(double[] mahalleDeger, double[] agirliklar) { ... }
```  
### 🏆 En Uygun Mahalle Seçimi  
Bu bölümde, mahallelerin skorları karşılaştırılarak en yüksek skorlu mahalle seçilir.  

## 🎯 Örnek Çıktı  
```
Karacaibrahim Mahallesi 5.423
Karakas Mahallesi 2.354
Pınar Mahallesi 4.876
En Uygun Güzergah: Karacaibrahim Mahallesi
```  

