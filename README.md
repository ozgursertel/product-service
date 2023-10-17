# Vaka Çalışması : Ürün Servisi

Kullanılan Teknolojiler:
Java,Spring Boot,Spring Web,Hibernate,PostgraSQL,Postman,DBeaver,Docker


Endpointler
1. Tüm Ürünleri Getir
  Endpoint: /products
  Metod: GET
  Açıklama: Tüm ürünlerin listesini alın.
  Yanıt:
    JSON formatında ürün nesnelerinin bulunduğu bir JSON dizisi ile 200 OK.
2. Yeni Bir Ürün Oluştur
  Endpoint: /product/add
  Metod: POST
  Açıklama: Yeni bir ürün oluşturun.
  İstek:
  Ürün detaylarını içeren JSON gövde.
  Yanıt:
    Oluşturulan yeni ürünün JSON formatında olduğu 201 Created.
3. Fiyat Aralığına Göre Ürünleri Bul
  Endpoint: /find/price
  Metod: GET
  Açıklama: Belirtilen fiyat aralığı içindeki ürünleri bulun.
  Sorgu Parametreleri:
    minValue (Double): Minimum fiyat.
    maxValue (Double): Maksimum fiyat.
  Yanıt:
    JSON formatında ürün nesnelerinin bulunduğu bir JSON dizisi ile 200 OK.
4. Markaya Göre Ürünleri Bul
  Endpoint: /find/brand
  Metod: GET
  Açıklama: Markaya göre ürünleri bulun.
  Sorgu Parametreleri:
  brand (String): Aranacak marka adı.
  Yanıt:
    JSON formatında ürün nesnelerinin bulunduğu bir JSON dizisi ile 200 OK.
5. Ürün Numarasına Göre Ürünü Bul
  Endpoint: /find/productNo
  Metod: GET
  Açıklama: Ürün numarası ile bir ürünü bulun.
  Sorgu Parametreleri:
    productNo (Long): Benzersiz ürün numarası.
Yanıt:
Ürünün JSON formatında olduğu 200 OK.
Ürün bulunamazsa 404 Not Found.
6. İsme Göre Ürünleri Bul
  Endpoint: /find/name
  Metod: GET
  Açıklama: İsme göre ürünleri bulun.
  Sorgu Parametreleri:
    name (String): Aranacak ürün adı.
  Yanıt:
    JSON formatında ürün nesnelerinin bulunduğu bir JSON dizisi ile 200 OK.
7. Bir Ürünü Güncelle
  Endpoint: /product/update
  Metod: PUT
    Açıklama: Mevcut bir ürünü güncelleyin.
  İstek:
    Güncellenmiş ürün detaylarını içeren JSON gövde.
  Yanıt:
    Güncellenmiş ürünün JSON formatında olduğu 200 OK.
    Ürün bulunamazsa 404 Not Found.
8. Bir Ürünü Yumuşak Bir Şekilde Sil
  Endpoint: /product/delete/{id}
  Metod: DELETE
  Açıklama: Ürünü ID'sine göre yumuşak bir şekilde silin.
  Yol Parametresi:
    id (Long): Silinecek ürünün ID'si.
  Yanıt:
    Silme işlemi başarılıysa 204 No Content.
    Ürün bulunamazsa 404 Not Found.




