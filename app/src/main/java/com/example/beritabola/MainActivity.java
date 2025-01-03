package com.example.beritabola;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.List;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Daftar dummy berita
        List<News> newsList = getDummyNews();

        // Menambahkan onClickListener untuk setiap item berita
        LinearLayout newsItem1 = findViewById(R.id.news_item_1);
        LinearLayout newsItem2 = findViewById(R.id.news_item_2);
        LinearLayout newsItem3 = findViewById(R.id.news_item_3);
        LinearLayout newsItem4 = findViewById(R.id.news_item_4);
        LinearLayout newsItem5 = findViewById(R.id.news_item_5);
        LinearLayout newsItem6 = findViewById(R.id.news_item_6);

        // Menampilkan detail berita saat item ditekan
        setupNewsItemClickListener(newsItem1, newsList.get(0));
        setupNewsItemClickListener(newsItem2, newsList.get(1));
        setupNewsItemClickListener(newsItem3, newsList.get(2));
        setupNewsItemClickListener(newsItem4, newsList.get(3));
        setupNewsItemClickListener(newsItem5, newsList.get(4));
        setupNewsItemClickListener(newsItem6, newsList.get(5));
    }

    // Method untuk membuat data dummy
    private List<News> getDummyNews() {
        List<News> newsList = new ArrayList<>();

        // 3 berita yang sudah ada
        newsList.add(new News("Manchester United Kalah di Pertandingan Terkini",
                "SEBANYAK 5 penyebab Manchester United kalah 0-2 dari Newcastle United di Liga Inggris 2022-2023 akan dibahas Okezone dalam artikel ini. Manchester United takluk 0-2 dari Newcastle United dalam lanjutan Liga Inggris musim ini di Stadion Saint-James Park, Minggu 2 April 2023 malam WIB.\n" +
                        "\n" +
                        "Kekalahan Setan Merah -julukan Manchester United- akibat dua gol dari pemain Newcastle United, yakni Joseph Willock (65') dan Callum Wilson (88'). Dengan hasil ini, posisi Manchester United digeser oleh Newcastle United yang sekarang menghuni peringkat ketiga klasemen sementara Liga Inggris 2022-2023 dengan 50 poin." +
                        "Sumber : https://bola.okezone.com/read/2023/04/03/45/2791913/5-penyebab-manchester-united-kalah-0-2-dari-newcastle-united-di-liga-inggris-2022-2023-nomor-1-gara-gara-casemiro-absen",
                "5 Penyebab Manchester United Kalah 0-2 dari Newcastle United di Liga Inggris 2022-2023, Nomor 1 Gara-Gara Casemiro Absen" +
                        "",
                "https://i.ibb.co.com/5Ks3k38/mu.jpg"));

        newsList.add(new News("Transfer Pemain Terbaru: Real Madrid",
                "Berikut adalah update terbaru mengenai berita transfer Real Madrid per hari ini, Selasa, 17 Desember 2024. Los Blancos disebut-sebut bakal mendatangkan empat pemain baru, termasuk Karim Benzema.\n" +
                        "\n" +
                        "Setelah meninggalkan Real Madrid untuk bergabung dengan Al Ittihad, Karim Benzema dilaporkan bersiap untuk kembali ke klub asalnya. Dia akan mengakhiri kontraknya di Liga Arab Saudi dan ada kemungkinan besar untuk kembali ke Santiago Bernabeu," +
                        "Sumber :https://www.bola.com/spanyol/read/5839555/berita-transfer-real-madrid-4-pemain-dipersiapkan-untuk-bangkit-di-liga-spanyol-termasuk-karim-benzema?page=2",
                "Real Madrid dan Manchester City bersaing mendapatkan Florian Wirtz, yang menjadi target transfer mereka. Namun, gelandang asal Jerman itu dikabarkan akan memperpanjang kontraknya dengan Bayer Leverkusen." +
                        "" +
                        "",
                "https://i.ibb.co.com/cQsdMv5/Real-Madrid-2025-jpg.webp"));

        newsList.add(new News("Prediksi Pertandingan Indonesia Melawan Arab Saudi",
                "Timnas Indonesia bertemu Timnas Arab Saudi pada matchday ke-6 Grup C Kualifikasi Piala Dunia 2026 di Stadion Gelora Bung Karno, Selasa (19/11). Laga Indonesia vs Arab Saudi dimainkan mulai pukul 19.00 malam WIB.\n" +
                        "\n" +
                        "Indonesia kini berada di dasar klasemen Grup C, dengan tiga poin dari lima laga. Pasukan Shin Tae-yong berada dalam tekanan setelah menelan kekalahan pada dua laga terakhir. Indonesia baru saja kalah dari China dan Jepang," +
                        "Sumber : https://www.bola.net/tim_nasional/prediksi-timnas-indonesia-vs-arab-saudi-19-november-2024-249c34.html",
                "",
                "https://i.ibb.co.com/KXX1r8Z/12-fifa-match-day-timnas.jpg"));

        // 3 berita baru
        newsList.add(new News("Liverpool Menang Dramatis di Injury Time",
                "meraih kemenangan krusial saat menjamu Fulham pada lanjutan pekan ke-14 Liga Inggris 2023/2024. Tim berjulukan The Reds menang dramatis 4-3 atas tamunya di Stadion Anfield, Liverpool, Minggu (3/12/2023) malam WIB.\n" +
                        "\n" +
                        "Liverpool membuka keunggulan pada menit ke-20 lewat gol bunuh diri kiper Fulham, Bernd Leno setelah mencoba mengantisipasi tendangan bebas cantik Trent Alexander-Arnold. Kemudian Fulham mampu menyamakan kedudukan lewat Harry Wilson pada empat menit berselang." +
                        "Alexis Mac Allister dengan tendangan kerasnya dari luar kotak penalti membawa Liverpool unggul 2-1 pada menit ke-38. Namun, Kenny Tete berhasil menyamakan kedudukan pada menit 45'+3." +
                        "Sumber : https://www.bola.com/inggris/read/5471616/liverpool-menang-dramatis-atas-fulham-di-liga-inggris-jurgen-klopp-amazing-golnya-keren-semua?page=2\n" +
                        "\n" +
                        "Pada babak kedua, Fulham berhasil beralik unggul lewat gol yang dicetak Bobby Reid pada menit ke-80. Namun, Liverpool tidak begitu saja menyerah di depan para pendukungnya.",
                "The Reds raih 3 poin penting lewat drama injury time",
                "https://i.ibb.co.com/4jrcpVk/OIP.jpg"));

        newsList.add(new News("Erling Haaland Pecahkan Rekor Gol Liga Inggris",
                "Manajer Manchester City, Pep Guardiola, ikut bahagia dengan rekor gol terbanyak dalam semusim di Premier League yang dipecahkan Erling Haaland. Menurut Pep, Haaland layak memecahkan rekor tersebut.\n" +
                        "\n" +
                        "Erling Haaland memecahkan rekor gol terbanyak dalam semusim pada era Premier League pada laga tunda pekan ke-28 Premier League 2022/2023 melawan West Ham United, Kamis (4/5/2023) dini hari WIB. Dalam laga yang digelar di Etihad Stadium, penyerang Manchester City itu mencetak gol pada menit ke-70." +
                        "Sumber : https://www.bola.com/inggris/read/5276620/erling-haaland-pecah-rekor-di-liga-inggris-pep-guardiola-dia-pantas-mendapatkannya#:~:text=Erling%20Haaland%20memecahkan%20rekor%20gol%20terbanyak%20dalam%20semusim,Manchester%20City%20itu%20mencetak%20gol%20pada%20menit%20ke-70.",
                "Striker Norwegia ukir rekor baru di Liga Inggris",
                "https://i.ibb.co.com/x15M7ZY/Haaland.webp"));

        newsList.add(new News("Barcelona Juara La Liga 2024",
                "Barcelona menjalani musim yang bagus pada 2022/2023 ini. Di bawah asuhan Xavi Hernandez, Blaugrana mampu menjadi juara La Liga.\n" +
                        "\n" +
                        "Barcelona mampu merebut takhta juara liga dari tangan Real Madrid. Ini menjadi gelar La Liga ke-27 yang diraih raksasa Catalan tersebut.\n" +
                        "\n" +
                        "Gelar kali ini juga begitu spesial bagi sang pelatih Xavi Hernandez. Ini jadi gelar La Liga pertama yang diberikannya untuk Barcelona." +
                        "Sumber : https://www.bola.net/editorial/5-pemain-muda-yang-membantu-barcelona-meraih-juara-la-liga-20222023-a0ba48.html",
                "Blaugrana kunci gelar La Liga setelah kalahkan rival abadi",
                "https://i.ibb.co.com/RN7KMD9/R.jpg"));

        return newsList;
    }

    // Method untuk mengatur onClickListener pada item berita
    private void setupNewsItemClickListener(LinearLayout newsItem, News news) {
        newsItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NewsDetailActivity.class);
                intent.putExtra("title", news.getTitle());
                intent.putExtra("content", news.getContent());
                intent.putExtra("imageUrl", news.getImageUrl());
                startActivity(intent);
            }
        });
    }
}