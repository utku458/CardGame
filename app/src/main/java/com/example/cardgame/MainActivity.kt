package com.example.cardgame

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.IntentCompat
import com.example.cardgame.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        supportActionBar?.hide()
        var sayac = 1
        var pcsayac=1
        var playertoplam = 0
        var gecicipctoplam=0
        var pctoplam = 0
        var kartsayisi = 51
        var durumpc=false
        var durum=false
        var cardlist = ArrayList<Card>()


        val builder = AlertDialog.Builder(this)
        builder.setTitle("Oyun bitti")
        builder.setMessage("bildirim")
        builder.setPositiveButton("Yes",DialogInterface.OnClickListener { dialog, which ->


            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)


        })
        builder.setNegativeButton("No",DialogInterface.OnClickListener { dialog, which ->
            System.exit(0)


        })



        cardlist =Cards.cardgonder()
        //binding.playerCardOne.setImageResource(cardlist.get(0).resim)
        var rndspc = (0..kartsayisi).random()
        var rnds = (0..kartsayisi-1).random()
        binding.PcCardOne.setImageResource(cardlist.get(rndspc).resim)
        pctoplam+=cardlist.get(rndspc).sayi
        binding.PcScore.setText(cardlist.get(rndspc).sayi.toString())
        cardlist.removeAt(rndspc)
        binding.playerCardOne.setImageResource(cardlist.get(rnds).resim)
        playertoplam+=cardlist.get(rnds).sayi
        binding.playerScore.setText(cardlist.get(rnds).sayi.toString())
        cardlist.removeAt(rnds)


        binding.pccekbtn.visibility = View.GONE

        binding.kardcekbtn.setOnClickListener {

            rnds = (0..kartsayisi--).random()
            rndspc = (0..kartsayisi--).random()



            if (sayac==1) {
                binding.pccekbtn.visibility=View.VISIBLE
                binding.kardcekbtn.visibility=View.GONE

                if (durum!=true && durumpc==true){
                    binding.pccekbtn.visibility= View.GONE
                    binding.kardcekbtn.visibility=View.VISIBLE
                }

                sayac++
                binding.playerCardTwo.setImageResource(cardlist.get(rnds).resim)

                if (playertoplam > 21 && (cardlist.get(rnds).id == 37 ||
                            cardlist.get(rnds).id == 38 || cardlist.get(rnds).id == 39
                            || cardlist.get(rnds).id == 40
                            )) {


                    var cekilenpuan = 1
                    playertoplam += cekilenpuan
                    binding.playerScore.setText(playertoplam.toString())

                } else {
                    var cekilenpuan = cardlist.get(rnds).sayi.toInt()
                    playertoplam += cekilenpuan
                    binding.playerScore.setText(playertoplam.toString())

                }
                cardlist.removeAt(rnds)


            }
            //pcnin eli


            else if (sayac==2){
                binding.pccekbtn.visibility=View.VISIBLE
                binding.kardcekbtn.visibility=View.GONE

                if (durum!=true && durumpc==true){
                    binding.pccekbtn.visibility= View.GONE
                    binding.kardcekbtn.visibility=View.VISIBLE
                }

                binding.playerCardThree.setImageResource(cardlist.get(rnds).resim)
                sayac++
                if (playertoplam>21 && (cardlist.get(rnds).id == 37 ||
                            cardlist.get(rnds).id == 38 || cardlist.get(rnds).id == 39
                            ||cardlist.get(rnds).id == 40)){
                    var cekilenpuan= 1
                    playertoplam+=cekilenpuan
                    binding.playerScore.setText(playertoplam.toString())

                }
                else{

                    var cekilenpuan= cardlist.get(rnds).sayi.toInt()
                    playertoplam+=cekilenpuan
                    binding.playerScore.setText(playertoplam.toString())


                    if(playertoplam>21){
                        binding.genelbilgi.setText("Oyuncu patladi")
                        builder.setMessage("PC kazandı tekrar oynamak ister misin?")
                        builder.show()

                    }
                }
                cardlist.removeAt(rnds)

            }




            else if (sayac==3){
                binding.pccekbtn.visibility=View.VISIBLE
                binding.kardcekbtn.visibility=View.GONE

                if (durum!=true && durumpc==true){
                    binding.pccekbtn.visibility= View.GONE
                    binding.kardcekbtn.visibility=View.VISIBLE
                }

                binding.playerCardFour.setImageResource(cardlist.get(rnds).resim)
                sayac++
                if (playertoplam>21 && (cardlist.get(rnds).id == 37 ||
                            cardlist.get(rnds).id == 38 || cardlist.get(rnds).id == 39
                            ||cardlist.get(rnds).id == 40)){


                    var cekilenpuan= 1
                    playertoplam+=cekilenpuan
                    binding.playerScore.setText(playertoplam.toString())

                }
                else{



                    var cekilenpuan= cardlist.get(rnds).sayi.toInt()
                    playertoplam+=cekilenpuan
                    binding.playerScore.setText(playertoplam.toString())

                    if(playertoplam>21){
                        binding.genelbilgi.setText("Oyuncu patladi")
                        builder.setMessage("PC kazandı tekrar oynamak ister misin?")
                        builder.show()

                    }
                }
                cardlist.removeAt(rnds)

            }

            else if (sayac==4){
                binding.pccekbtn.visibility=View.VISIBLE
                binding.kardcekbtn.visibility=View.GONE

                if (durum!=true && durumpc==true){
                    binding.pccekbtn.visibility= View.GONE
                    binding.kardcekbtn.visibility=View.VISIBLE
                }

                sayac++
                binding.playerCardFive.setImageResource(cardlist.get(rnds).resim)

                if (playertoplam>21 && (cardlist.get(rnds).id == 37 ||
                            cardlist.get(rnds).id == 38 || cardlist.get(rnds).id == 39
                            ||cardlist.get(rnds).id == 40)){


                    var cekilenpuan= 1
                    playertoplam+=cekilenpuan
                    binding.playerScore.setText(playertoplam.toString())

                }
                else{
                    var cekilenpuan= cardlist.get(rnds).sayi.toInt()
                    playertoplam+=cekilenpuan
                    binding.playerScore.setText(playertoplam.toString())

                    if(playertoplam>21){
                        binding.genelbilgi.setText("Oyuncu patladi")
                        builder.setMessage("PC kazandı tekrar oynamak ister misin?")
                        builder.show()
                    }
                }
                cardlist.removeAt(rnds)

            }

        }


        binding.pccekbtn.setOnClickListener {



            rnds = (0..kartsayisi--).random()
            rndspc = (0..kartsayisi--).random()







            if (pcsayac==1) {

                binding.pccekbtn.visibility=View.GONE
                binding.kardcekbtn.visibility=View.VISIBLE

                if (durum==true && durumpc!=true){
                    binding.pccekbtn.visibility= View.VISIBLE
                    binding.kardcekbtn.visibility=View.GONE
                }

                pcsayac++
                binding.PcCardTwo.setImageResource(cardlist.get(rndspc).resim)

                if (pctoplam > 21 && (cardlist.get(rndspc).id == 37 ||
                            cardlist.get(rndspc).id == 38 || cardlist.get(rndspc).id == 39
                            || cardlist.get(rndspc).id == 40
                            )) {


                    var cekilenpuan = 1
                    pctoplam += cekilenpuan
                    binding.PcScore.setText(pctoplam.toString())

                } else {
                    var cekilenpuan = cardlist.get(rndspc).sayi.toInt()
                    pctoplam += cekilenpuan
                    binding.PcScore.setText(pctoplam.toString())

                }
                cardlist.removeAt(rndspc)


            }
            //pcnin eli


            else if (pcsayac==2){
                binding.pccekbtn.visibility=View.GONE
                binding.kardcekbtn.visibility=View.VISIBLE

                if (durum==true && durumpc!=true){
                    binding.pccekbtn.visibility= View.VISIBLE
                    binding.kardcekbtn.visibility=View.GONE
                }

                if (durum==true){
                    binding.pccekbtn.visibility= View.VISIBLE
                }

                binding.PcCardThree.setImageResource(cardlist.get(rndspc).resim)
                pcsayac++
                if (pctoplam>21 && (cardlist.get(rndspc).id == 37 ||
                            cardlist.get(rndspc).id == 38 || cardlist.get(rndspc).id == 39
                            ||cardlist.get(rndspc).id == 40)){
                    var cekilenpuan= 1
                    pctoplam+=cekilenpuan
                    binding.PcScore.setText(pctoplam.toString())

                }
                else{

                    var cekilenpuan= cardlist.get(rndspc).sayi.toInt()
                    pctoplam+=cekilenpuan
                    binding.PcScore.setText(pctoplam.toString())


                    if(pctoplam>21){
                        binding.genelbilgi.setText("Pc patladi")
                        builder.setMessage("Oyuncu kazandı tekrar oynamak ister misin?")
                        builder.show()

                    }
                }
                cardlist.removeAt(rndspc)

            }



            else if (pcsayac==3){
                binding.pccekbtn.visibility=View.GONE
                binding.kardcekbtn.visibility=View.VISIBLE

                if (durum==true && durumpc!=true){
                    binding.pccekbtn.visibility= View.VISIBLE
                    binding.kardcekbtn.visibility=View.GONE
                }

                binding.PcCardFour.setImageResource(cardlist.get(rndspc).resim)
                pcsayac++
                if (pctoplam>21 && (cardlist.get(rndspc).id == 37 ||
                            cardlist.get(rndspc).id == 38 || cardlist.get(rndspc).id == 39
                            ||cardlist.get(rndspc).id == 40)){
                    var cekilenpuan= 1
                    pctoplam+=cekilenpuan
                    binding.PcScore.setText(pctoplam.toString())

                }
                else{

                    var cekilenpuan= cardlist.get(rndspc).sayi.toInt()
                    pctoplam+=cekilenpuan
                    binding.PcScore.setText(pctoplam.toString())


                    if(pctoplam>21){
                        binding.genelbilgi.setText("Pc patladi")
                        builder.setMessage("Oyuncu kazandı tekrar oynamak ister misin?")
                        builder.show()

                    }
                }
                cardlist.removeAt(rndspc)

            }


            else if (pcsayac==4){
                binding.pccekbtn.visibility=View.GONE
                binding.kardcekbtn.visibility=View.VISIBLE

                if (durum==true && durumpc!=true){
                    binding.pccekbtn.visibility= View.VISIBLE
                    binding.kardcekbtn.visibility=View.GONE
                }

                binding.PcCardFour.setImageResource(cardlist.get(rndspc).resim)
                pcsayac++
                if (pctoplam>21 && (cardlist.get(rndspc).id == 37 ||
                            cardlist.get(rndspc).id == 38 || cardlist.get(rndspc).id == 39
                            ||cardlist.get(rndspc).id == 40)){
                    var cekilenpuan= 1
                    pctoplam+=cekilenpuan
                    binding.PcScore.setText(pctoplam.toString())

                }
                else{

                    var cekilenpuan= cardlist.get(rndspc).sayi.toInt()
                    pctoplam+=cekilenpuan
                    binding.PcScore.setText(pctoplam.toString())


                    if(pctoplam>21){
                        binding.genelbilgi.setText("Pc patladi")
                        builder.setMessage("Oyuncu kazandı tekrar oynamak ister misin?")
                        builder.show()

                    }
                }
                cardlist.removeAt(rndspc)

            }







        }


        binding.pcdurbtn.setOnClickListener {

            durumpc = true
            binding.pccekbtn.visibility = View.GONE
            if (durumpc==true && durum!=true){
                binding.kardcekbtn.visibility = View.VISIBLE
            }

            if (durum==true && durumpc==true){

                if (pctoplam<=21 && pctoplam>playertoplam){

                    binding.genelbilgi.setText("Pc kazandi")
                    builder.setMessage("PC kazandı tekrar oynamak ister misin?")
                    builder.show()
                }else{
                    builder.setMessage("Oyuncu kazandı tekrar oynamak ister misin?")
                    builder.show()
                }


            }

        }

        binding.durbtn.setOnClickListener {
            durum= true
            binding.kardcekbtn.visibility = View.GONE
            if (durum==true && durumpc!=true){
                binding.pccekbtn.visibility = View.VISIBLE
            }



            if (durum==true && durumpc==true){

                if (playertoplam<=21 && playertoplam>pctoplam){

                    binding.genelbilgi.setText("Player kazandi")
                    builder.setMessage("Oyuncu kazandı tekrar oynamak ister misin?")
                    builder.show()

                }else{

                    builder.setMessage("PC kazandı tekrar oynamak ister misin?")
                    builder.show()
                }



            }

        }



    }
}