package br.com.modulo1.androidaccelerate.basckete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int pontuacaoTimeA = 0;
    private int pontuacaoTimeB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recupera o botão e posteriormente chama o método setOnclickListener para executar uma ação para o time A
        Button botaoTresPontosEquipeA = (Button) findViewById(R.id.tresPontosEquipeA);
        botaoTresPontosEquipeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTresPontosEquipeA();
            }
        });

        Button botaoDoisPontosEquipeA = (Button) findViewById(R.id.doisPontosEquipeA);
        botaoDoisPontosEquipeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addDoisPontosEquipeA();
            }
        });

        Button botaoTiroLivreEquipeA = (Button) findViewById(R.id.tiroLivreEquipeA);
        botaoTiroLivreEquipeA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addUmPontoEquipeA();
            }
        });

        // //Recupera o botão e posteriormente chama o método setOnclickListener para executar uma ação para o time B

        Button botaoTresPontosEquipeB = (Button) findViewById(R.id.tresPontosEquipeB);
        botaoTresPontosEquipeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTresPontosEquipeB();
            }
        });

        Button botaoDoisPontosEquipeB = (Button) findViewById(R.id.doisPontosEquipeB);
        botaoDoisPontosEquipeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addDoisPontosEquipeB();
            }
        });

        Button botaoTiroLivreEquipeB = (Button) findViewById(R.id.tiroLivreEquipeB);
        botaoTiroLivreEquipeB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                addUmPontoEquipeB();
            }
        });

        Button reiniciarPartida = (Button) findViewById(R.id.reiniciar_pardida);
        reiniciarPartida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reiniciarPartida();
            }
        });
    }

    /**
     * Médodo responsável por mostrar a pontuação da equipe na tela do aplicativo
     * @param pontuacao valor inteiro que será mostrado
     */
    public void mostrarPlacarEquipeA(int pontuacao){
        TextView placarEquipeA = (TextView) findViewById(R.id.placarEquipeA);
        placarEquipeA.setText(String.valueOf(pontuacao));
    }

    public void mostrarPlacarEquipeB(int pontuacao){
        TextView placarEquipeB = (TextView) findViewById(R.id.placarEquipeB);
        placarEquipeB.setText(String.valueOf(pontuacao));
    }

    //Medodo para adicionar 3 pontos à equipe A
    public void addTresPontosEquipeA(){
        pontuacaoTimeA = pontuacaoTimeA + 3;
        mostrarPlacarEquipeA(pontuacaoTimeA);
    }

    public void addTresPontosEquipeB(){
        pontuacaoTimeB = pontuacaoTimeB + 3;
        mostrarPlacarEquipeB(pontuacaoTimeB);
    }

    //Medodo para adicionar 2 pontos à equipe A
    public void addDoisPontosEquipeA(){
        pontuacaoTimeA = pontuacaoTimeA + 2;
        mostrarPlacarEquipeA(pontuacaoTimeA);
    }

    public void addDoisPontosEquipeB(){
        pontuacaoTimeB = pontuacaoTimeB + 2;
        mostrarPlacarEquipeB(pontuacaoTimeB);
    }

    //Medodo para adicionar 1 ponto à equipe A
    public void addUmPontoEquipeA(){
        pontuacaoTimeA = pontuacaoTimeA + 1;
        mostrarPlacarEquipeA(pontuacaoTimeA);
    }
    public void addUmPontoEquipeB(){
        pontuacaoTimeB = pontuacaoTimeB + 1;
        mostrarPlacarEquipeB(pontuacaoTimeB);
    }

    public void reiniciarPartida(){
        pontuacaoTimeA = 0;
        pontuacaoTimeB = 0;
        mostrarPlacarEquipeA(pontuacaoTimeA);
        mostrarPlacarEquipeB(pontuacaoTimeB);
    }
}
