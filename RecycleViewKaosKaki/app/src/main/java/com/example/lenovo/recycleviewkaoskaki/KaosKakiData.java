package com.example.lenovo.recycleviewkaoskaki;

import java.util.ArrayList;

public class KaosKakiData {
    public static String[][] data = new String[][]{
            {"Pattent Good", "Kalau dilihat lebih detail, motif pada kaus kaki Pattent Good itu jauh dari kesan konvensional. Garis-garis vertikal dan horizontal yang kerap bertabrakan jadi ciri utama kaos kaki ini. Selain motifnya unik bahan yang digunakan juga sangat nyaman di kaki sehingga Pattent Good sangat cocok digunakan untuk menemani aktivitas kamu. Mau dipadukan dengan sneakers atau sandal? Boleh banget.", "https://s3.bukalapak.com/uploads/content_attachment/882367f810e8d76269caffb5/w-744/42484970_759487274390227_4740253338948812197_n.jpg"},
            {"Staycoolsocks", "Kalau yang ini cocok banget buat kalian yang berkepribadian aktif dan sporty. Motif dari Staycoolsocks bakal match banget dengan sneakers favorit kalian. Dijamin gaya kalian akan semakin kece kalau pakai kaus kaki ini. Komposisi yang meriah menghasilkan visual dinamis dan sangat menggoda mata untuk melihat lebih detail. Racikan warna-warna yang dituangkan ke dalam motif-motif kaus kakinya turut memperkaya estetika kaos kaki tersebut.", "https://s4.bukalapak.com/uploads/content_attachment/96665040d321664cc9caffb5/w-744/38651964_1790249817691245_172253571826319360_n.jpg"},
            {"Kamengski", "Memang brand ini tidak khusus menjual kaus kaki, tapi artikel kaus kaki dari Kamengski ini wajib ada di rak kaus kaki kamu. Desainnya sangat lokal banget. Orang yang melihatnya akan langsung memerhatikan ketika kalian menggunakan kaos kaki ini. Untuk material bahan, kaus kaki ini menggunakan tiga jenis bahan, yakni katun, nilon dan spandex. Tenang saja, bahan-bahan yang diracik untuk dijadikan kaus kaki ini tidak mudah membuat kaki panas, kok. Berani pakai?", "https://s0.bukalapak.com/uploads/content_attachment/f4d03db410e8d7623acaffb5/w-744/40910167_921314908059611_1677260735098696693_n.jpg"},
            {"Stayhoops", "Kalian suka bingung dengan kaus kaki olahraga yang motifnya itu-itu saja? Tenang, Stayhoops menyediakan jawaban buat kamu yang doyan olahraga khususnya bola basket tapi ingin tetap gaya. Berbagai motif kaus kaki dari Stayhoops ini cocok buat nemenin kalian ketika olahraga. Bahannya juga sangat nyaman banget di kaki.", "https://s0.bukalapak.com/uploads/content_attachment/5b319cc710e8d7629acaffb5/w-744/43695418_2031505410264559_3022135326584417287_n.jpg"},
            {"Sinau Socks", "Buat kalian yang suka motif tribal dan stripe, kaus kaki Sinau yang dibuat dengan bahan katun premium lokal yang dipadukan dengan nilon untuk menyerap keringat ini pilihan yang tepat untuk menemani aktivitas kamu. Kata Sinau yang mempunyai arti belajar dalam bahasa Jawa ini cocok banget buat kalian yang menginginkan kesan modern tapi vintage. Koleksi Sinau pun sangat beragam sehingga kamu bisa memilihnya untuk mempertegas gayamu ketika menggunakan outer atau kaos yang sesuai dengan warna kaos kakinya.", "https://s3.bukalapak.com/uploads/content_attachment/3455885410e8d7620bcaffb5/w-744/41942201_308098316440325_7979291924291352147_n.jpg"},
            {"Voria Socks", "Kaos kaki Voria Socks juga menjadi salah satu merek yang perlu dijadikan referensi saat ingin membeli kaos kaki. Banyak keunggulan yang ditawarkan seperti bahan yang tidak mudah rusak, harga sangat terjangkau dan sangat nyaman digunakan.", "https://s3.bukalapak.com/uploads/content_attachment/8f2d93be10e8d762218be3c5/w-744/Merek-Kaos-Kaki-Pria7.jpg"},
    };
    public static ArrayList<KaosKaki> getListData(){
        ArrayList<KaosKaki> list = new ArrayList<>();
        for (String[] aData : data) {
            KaosKaki kaos = new KaosKaki();
            kaos.setName(aData[0]);
            kaos.setDesc(aData[1]);
            kaos.setPhoto(aData[2]);
            list.add(kaos);
        }
        return list;
    }
}
