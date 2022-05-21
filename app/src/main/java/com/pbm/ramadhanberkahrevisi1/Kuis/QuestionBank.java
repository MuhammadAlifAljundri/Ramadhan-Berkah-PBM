package com.pbm.ramadhanberkahrevisi1.Kuis;

public class QuestionBank {
    private String textQuestions [] = {
            "1.Waktu shalat subuh dimulai dari munculnya?",
            "2. Cara Menjadi Kuat seperti karakter anime?",
            "3. Siapa Presiden Indonesia Sekarang?",
            "4. Apa Nama Ibukota Indonesia?",
            "5. Jika Tahun ini 2020,maka Tahun depan?",
            "6. ini pertanyaan keemam?"

    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"Fajar kidzib", "Syafaq", "dipegang oleh elit global", "Dimars"},
            {"Masuk Isekai", "Makan Buah Iblis", "Menggunakam Chakra Kyubii", "Meminta Bantuan Kami-sama"},
            {"Megawati", "Prabowo", "Bj Habibi", "Jokowi"},
            {"Palembang", "Bandung", "Jakarta", "Surabaya"},
            {"1999", "2022", "2010", "2021"},
            {"Megawati", "Prabowo", "Bj Habibi", "Jokowi"},
    };

    private String mCorrectAnswers[] = {"YNTKTS", "Masuk Isekai", "Jokowi", "Jakarta", "2021", "Prabowo"};

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
