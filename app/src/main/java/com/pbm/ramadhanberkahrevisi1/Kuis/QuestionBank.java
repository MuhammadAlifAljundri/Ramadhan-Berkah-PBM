package com.pbm.ramadhanberkahrevisi1.Kuis;

public class QuestionBank {
    private String textQuestions [] = {
            "1. Waktu shalat subuh dimulai dari munculnya?",
            "2. Yang tidak termasuk syarat-syarat shalat adalah?",
            "3. Memejamkan mata, menutup mulut rapat-rapat, dan menengadah ke langit, termasuk ke dalam?",
            "4. Shalat tarawih dilaksanakan pada malam hari selama?",
            "5. Puasa ramadan termasuk ibadah wajib yang sudah dijelaskan melalui firman Allah SWT dalam al-Quran surah?",
            "6. Yang tidak termasuk syarat-syrat wajib berpuasa adalah?",
            "7. Yang termasuk ke dalam makruh puasa adalah?",
            "8. Hal-hal yang diperbolehkan untuk tidak berpuasa adalah?",
            "9. Yang tidak termasuk ke dalam rukun shalat, yaitu?",
            "10. Pengertian fajar Shadiq adalah?",

    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"Fajar kidzib", "Syafaq", "Fajar shadiq", "Mega-mega merah"},
            {"Sudah baligh dan berakal", "Menutup aurat", "Berhadast", "Suci seluruh anggota badan, pakaian dan tempat"},
            {"Syarat shalat", "Makruh shalat", "Rukun shalat", "Yang membatalkan shalat"},
            {"Bulan ramadhan", "Bulan syawal", "Bulan rajab", "Bulan syaban"},
            {"Q.S Al-Baqarah ayat 182", "Q.S Al-Baqarah ayat 183", "Q.S Al-Baqarah ayat 184", "Q.S Al-Baqarah ayat 185"},
            {"Berakal", "Islam", "Belum baligh", "Sehat Jasmani dan rohani"},
            {"Sahur", "Segera berbuka saat waktu berbuka", "Merasakan makanan dengan lidah", "Berbuka dengan yang manis"},
            {"Perjalanan jauh", "Menyusui dan hamil", "Lanjut usia", "Semua benar"},
            {"Membaca niat, takbiartul ihram, berdiri tegak", "Sujud, duduk di antara dua sujud, tertib", "Membaca fatihah, rukuk, membaca qunut", "Berdiri tegak, membaca fatihah, rukuk, sujud"},
            {"Cahaya putih yang melintang di ufuk barat sampai matahari terbit", "Cahaya putih yang melintang di ufuk timur sampai matahari terbit", "Cahaya putih yang lurus keatas di ufuk barat sampai matahari terbit", "Cahaya putih yang lurus keatas di ufuk timur sampai matahari terbit"},
    };

    private String mCorrectAnswers[] = {"Fajar shadiq", "Berhadast", "Makruh shalat", "Bulan ramadan", "Q.S Al-Baqarah ayat 183", "Belum baligh", "Merasakan makanan dengan lidah", "Semua benar", "Membaca fatihah, rukuk, membaca qunut", "Cahaya putih yang melintang di ufuk timur sampai matahari terbit" };

    public int getLength(){
        return textQuestions.length;
    }

    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
