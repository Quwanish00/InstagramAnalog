package com.example.instagram_recycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.instagram_recycle.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val name ="Quwanish"
    private val surname ="Qidirbaev"

    private var adapter = Adapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerview.adapter = adapter
        setMockData()

        adapter.setOnInnerItemClickListener {id->
            Snackbar.make(binding.root,"$surname $name $id",Snackbar.LENGTH_SHORT).show()
        }


    }

    private fun setMockData() {
        val verticalItems = mutableListOf<Items>()

        repeat(5) {
            val profile = mutableListOf<InstaProfile>()

            when (it) {
                0 -> {
                    repeat(10) { i ->
                        when (i) {
                            0 -> {
                                profile.add(InstaProfile(i, R.drawable.ramos, "serxio_ramos"))
                            }
                            1 -> {
                                profile.add(InstaProfile(i, R.drawable.ronaldu, "cristiano"))
                            }
                            2 -> {
                                profile.add(InstaProfile(i, R.drawable.messi, "lionel_messi"))
                            }
                            3 -> {
                                profile.add(InstaProfile(i, R.drawable.suarez, "suarez"))
                            }
                            4 -> {
                                profile.add(InstaProfile(i, R.drawable.silva, "david_silva"))
                            }
                            5 -> {
                                profile.add(InstaProfile(i, R.drawable.bekxam, "bekxam"))
                            }
                            6 -> {
                                profile.add(InstaProfile(i, R.drawable.kavani, "edinson_kavani"))
                            }
                            7 -> {
                                profile.add(InstaProfile(i, R.drawable.ronaldinio, "ronaldinio"))
                            }
                            8 -> {
                                profile.add(InstaProfile(i, R.drawable.asensio, "asensio"))
                            }
                            9 -> {
                                profile.add(InstaProfile(i, R.drawable.alexis, "alexis_sanchez"))
                            }


                        }

                    }
                    verticalItems.add(RvInstaProfiles(it, profile))

                }
                1 -> {
                    verticalItems.add(
                        InstaPublikations(
                            it,
                            R.drawable.ramos,
                            "serxio_ramos",
                            "Real_Madrid",
                            R.drawable.dots,
                            R.drawable.ramos,
                            R.drawable.heart,
                            R.drawable.comment,
                            R.drawable.send,
                            R.drawable.save,
                            "40k отметок  Нравится   serxio_ramos  I Love RealMAdrid",
                            "Посмотреть все комментарий         2 час  назад",
                            R.drawable.smile,
                            "Добавьте комментарий",
                            "Опубликовать"
                        )
                    )
                }
                2 -> {
                    verticalItems.add(
                        InstaPublikations(
                            it,
                            R.drawable.ronaldu,
                            "cristiano",
                            "PSJ",
                            R.drawable.dots,
                            R.drawable.ronaldu,
                            R.drawable.heart,
                            R.drawable.comment,
                            R.drawable.send,
                            R.drawable.save,
                            "60m отметок  Нравится   cristiano  I Love RealMAdrid",
                            "Посмотреть все комментарий         2 час  назад",
                            R.drawable.smile,
                            "Добавьте комментарий",
                            "Опубликовать"
                        )
                    )
                }
                3 -> {
                    verticalItems.add(
                        InstaPublikations(
                            it,
                            R.drawable.silva,
                            "silva",
                            "ManchesterCity",
                            R.drawable.dots,
                            R.drawable.silva,
                            R.drawable.heart,
                            R.drawable.comment,
                            R.drawable.send,
                            R.drawable.save,
                            "20k отметок  Нравится   silva  I Love RealMAdrid",
                            "Посмотреть все комментарий         2 час  назад",
                            R.drawable.smile,
                            "Добавьте комментарий",
                            "Опубликовать"
                        )
                    )
                }
                4 -> {
                    verticalItems.add(
                        InstaPublikations(
                            it,
                            R.drawable.ronaldinio,
                            "ronaldinio",
                            "Brazilia",
                            R.drawable.dots,
                            R.drawable.ronaldinio,
                            R.drawable.heart,
                            R.drawable.comment,
                            R.drawable.send,
                            R.drawable.save,
                            "1m отметок  Нравится   ronaldinio  I Love RealMAdrid",
                            "Посмотреть все комментарий         2 час  назад",
                            R.drawable.smile,
                            "Добавьте комментарий",
                            "Опубликовать"
                        )
                    )
                }
                5 -> {
                    verticalItems.add(
                        InstaPublikations(
                            it,
                            R.drawable.kavani,
                            "kavani",
                            "ManchesterCity",
                            R.drawable.dots,
                            R.drawable.kavani,
                            R.drawable.heart,
                            R.drawable.comment,
                            R.drawable.send,
                            R.drawable.save,
                            "15k отметок  Нравится   serxio_ramos  I Love RealMAdrid",
                            "Посмотреть все комментарий         2 час  назад",
                            R.drawable.smile,
                            "Добавьте комментарий",
                            "Опубликовать"
                        )
                    )
                }
                6 -> {
                    verticalItems.add(
                        InstaPublikations(
                            it,
                            R.drawable.suarez,
                            "suarez",
                            "Liverpool",
                            R.drawable.dots,
                            R.drawable.suarez,
                            R.drawable.heart,
                            R.drawable.comment,
                            R.drawable.send,
                            R.drawable.save,
                            "4k отметок  Нравится   serxio_ramos  I Love RealMAdrid",
                            "Посмотреть все комментарий         2 час  назад",
                            R.drawable.smile,
                            "Добавьте комментарий",
                            "Опубликовать"
                        )
                    )
                }
                7 -> {
                    verticalItems.add(
                        InstaPublikations(
                            it,
                            R.drawable.messi,
                            "lionel_messi",
                            "Barcelona",
                            R.drawable.dots,
                            R.drawable.messi,
                            R.drawable.heart,
                            R.drawable.comment,
                            R.drawable.send,
                            R.drawable.save,
                            "40m отметок  Нравится   serxio_ramos  I Love RealMAdrid",
                            "Посмотреть все комментарий         2 час  назад",
                            R.drawable.smile,
                            "Добавьте комментарий",
                            "Опубликовать"
                        )
                    )
                }
                8 -> {
                    verticalItems.add(
                        InstaPublikations(
                            it,
                            R.drawable.bekxam,
                            "bekxam",
                            "PSJ",
                            R.drawable.dots,
                            R.drawable.bekxam,
                            R.drawable.heart,
                            R.drawable.comment,
                            R.drawable.send,
                            R.drawable.save,
                            "50m отметок  Нравится   serxio_ramos  I Love RealMAdrid",
                            "Посмотреть все комментарий         2 час  назад",
                            R.drawable.smile,
                            "Добавьте комментарий",
                            "Опубликовать"
                        )
                    )
                }

            }
        adapter.models =verticalItems
        }

    }

}