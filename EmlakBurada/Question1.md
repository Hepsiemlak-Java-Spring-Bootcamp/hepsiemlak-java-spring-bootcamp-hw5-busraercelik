# Monolitik Mimari

Monolitik mimarinin çalışma yapısını anlamak için bir örnekle başlayalım. Client tarafından gelen istek 8080 portunda çalışan sunucumuza geldiğini düşünelim. Sunucu üzerinde çalışan projemiz gelen isteği db'ye sorar ve db'den gelen bilgilerle istenilen veriyi getirir.

Monolitik mimaride sunucunuz içinde üç katman vardır.

1- Presentation Layer
2- Business Layer
3- Data Access Layer

## Monolitik Mimaride Ölçeklendirme

Yoğun istek gelen bir endpoint olsun ve projeyi ölçeklendirmek için sunucuyu duplicate ederiz. Tarayıcıdan gelen isreği önce Load balancer karşılar. Load balancer yükü yatay ölçeklendirilmiş sunucular üzerinde dağıtır. Bunu gelen isteklerin durumuna göre yapar.

## Monolitik Mimarinin Avantajları

- Geliştirmesi basit
- Test edilebilirliği kolay
- Deployment kolay
- Ölçeklendirme oldukça kolay. Yatay olarak mimarinin kopyasını load balancer arkasında çalıştırabilirsiniz.

## Monolitik Mimarinin Dezavantajları

- Bakımı proje büyüdükçe zorlaşır
- Uygulamanın boyutu başlama süresini yavaşlatabilir.
- Uygulamayı güncellediğimiz zaman tüm uygulamayı deploy etmemiz gerekir.
- Ölçeklendirme tüm proje genelinde yapılır. Odaklı ölçeklendirme yapmamız pek mümkün değil.

# Microservice Architecture

- SOA'nın bir yorumudur.
- Her bir servis kendine ait bir sunucuda çalışır.
- Kendine ait veritabanları vardır.
- Hedef sadece küçük bir işi çok iyi yapmaktır.
- API Gateway üzerinden dış ve iç dünyaya açılırlar.
- Her bir proje farklı dilde yazılabilir, herhangi bir teknoloji ve dile bağımlı değildir.
- Kolay ölçeklenebilir.

## Microservice Avantajları

- Çok dilli mimari
- Kolay ölçeklendirme
- Daha iyi takım yönetimi

## Mikroservice Dezavantajları

- Servisler arası iletişim Network call üzerinden yapıldığı için overload oluşabilir. 
