package com.appyfurious.spp_bsuir_hcl.repositories

import com.appyfurious.spp_bsuir_hcl.db.Actor
import com.appyfurious.spp_bsuir_hcl.db.Film
import com.appyfurious.spp_bsuir_hcl.db.Producer
import com.appyfurious.spp_bsuir_hcl.db.Video
import io.realm.Realm

class FilmRepository {

    val films = listOf(
            Film().apply {
                this.name = "Зелёная миля"
                this.tags.addAll(listOf(
                        "Драма",
                        "Фэнтези",
                        "Криминал"
                ))
                this.imageLink = "https://upload.wikimedia.org/wikipedia/ru/c/ce/Green_mile.jpg"
                this.video = Video().apply {
                    this.link = "https://youtu.be/UEsacMEOhf4"
                    this.preview = "https://upload.wikimedia.org/wikipedia/ru/c/ce/Green_mile.jpg"
                    this.description = "Художественный фильм «Зеленая миля» является экранизацией одноименного романа Стивена Кинга и повествует о необычных событиях, произошедших в федеральной тюрьме штата Луизиана “Холодная гора”. Основные события фильма разворачиваются в 1935 году. По долгу службы надзиратель тюрьмы Пол Эджкомб вынужден сталкиваться с самыми опасными преступниками, которых приговорили к смертной казни, так как работает в блоке, где содержатся заключенные-смертники."
                }
                this.producers.addAll(listOf(
                        Producer().apply {
                            this.firstName = "Фрэнк"
                            this.lastName = "Дарабонт"
                            this.about = "американский кинорежиссёр, сценарист и продюсер венгерского происхождения. Был трижды номинирован на «Оскар». Известен своими удачными экранизациями романов Стивена Кинга: «Побег из Шоушенка», «Зелёная миля», «Мгла» и другие."
                        }
                ))
                this.actors.addAll(
                        listOf(Actor().apply {
                            this.firstName = "То́мас"
                            this.middleName = "Дже́ффри"
                            this.lastName = "Хэнкс"
                            this.about = "Американский актёр, продюсер, режиссёр, сценарист и писатель."
                        })
                )
            },
            Film().apply {
                this.name = "Побег из Шоушенка"
                this.tags.addAll(listOf(
                        "Драма"
                ))
                this.imageLink = "https://upload.wikimedia.org/wikipedia/ru/d/de/Movie_poster_the_shawshank_redemption.jpg"
                this.video = Video().apply {
                    this.link = "https://kinogo.by/5885-watch-online-movie-pobeg-iz-shoushenka_the-shawshank-redemption_1994.html"
                    this.preview = "https://upload.wikimedia.org/wikipedia/ru/d/de/Movie_poster_the_shawshank_redemption.jpg"
                    this.description = "Успешный банкир Энди Дюфрейн обвинен в убийстве своей жены и ее любовника. Оказавшись в тюрьме под названием Шоушенк, он встречается с безжалостностью и беззаконием, царящими по обе стороны решетки. Каждый, кто попадает в эти стены, становится их рабом до конца жизни. Но Энди, вооруженный живым умом и доброй душой, отказывается примиряться с приговором судьбы и начинает разрабатывать неописуемо дерзкий план своего освобождения. "
                }
                this.producers.addAll(listOf(
                        Producer().apply {
                            this.firstName = "Роббинс"
                            this.lastName = "Тим"
                            this.about = "Американский актёр, сценарист, кинорежиссёр и кинопродюсер"
                        }
                ))
                this.actors.addAll(
                        listOf(Actor().apply {
                            this.firstName = "То́мас"
                            this.lastName = "Дже́ффри"
                            this.about = "Американский актёр, продюсер, режиссёр, сценарист и писатель"
                        })
                )
            },
            Film().apply {
                this.name = "Омерзительная восьмерка"
                this.tags.addAll(listOf(
                        "Детективный вестерн"
                ))
                this.imageLink = "https://upload.wikimedia.org/wikipedia/ru/d/d4/The_Hateful_Eight.jpg"
                this.video = Video().apply {
                    this.link = "https://kinogo.by/3379-smotret-onlayn-film-omerzitelnaya-vosmerka-2016.html"
                    this.preview = "https://upload.wikimedia.org/wikipedia/ru/d/d4/The_Hateful_Eight.jpg"
                    this.description = "США после Гражданской войны. Легендарный охотник за головами Джон Рут по кличке Вешатель конвоирует заключенную. По пути к ним прибиваются еще несколько путешественников. Снежная буря вынуждает компанию искать укрытие в лавке на отшибе, где уже расположилось весьма пестрое общество: генерал конфедератов, мексика"
                }
                this.producers.addAll(listOf(
                        Producer().apply {
                            this.firstName = "Квентин"
                            this.lastName = "Тарантино"
                            this.about = "американский кинорежиссёр, сценарист, актёр, кинопродюсер и кинооператор. Один из наиболее ярких представителей постмодернизма в кинематографе."
                        }
                ))
                this.actors.addAll(
                        listOf(Actor().apply {
                            this.firstName = "Сэмюэл"
                            this.middleName = "Лерой"
                            this.lastName = "Джексон"
                            this.about = " Американский актёр кино и телевидения, продюсер."
                        })
                )
            },
            Film().apply {
                this.name = "Джанго освобождённый"
                this.tags.addAll(listOf(
                        "Комедия",
                        "Cпагетти-вестерн"
                ))
                this.imageLink = "https://upload.wikimedia.org/wikipedia/ru/b/ba/Django_Unchained.jpg"
                this.video = Video().apply {
                    this.link = "https://kinogo.by/4373-smotret-onlayn-film-dzhango-osvobozhdennyy-2012.html"
                    this.preview = "https://upload.wikimedia.org/wikipedia/ru/b/ba/Django_Unchained.jpg"
                    this.description = "Эксцентричный охотник за головами, также известный как «Дантист», промышляет отстрелом самых опасных преступников. Работенка пыльная, и без надежного помощника ему не обойтись. Но как найти такого и желательно не очень дорогого? Беглый раб по имени Джанго — прекрасная кандидатура. Правда, у нового помощника свои мотивы — кое с чем надо разобраться… "
                }
                this.producers.addAll(listOf(
                        Producer().apply {
                            this.firstName = "Квентин"
                            this.lastName = "Тарантино"
                            this.about = "американский кинорежиссёр, сценарист, актёр, кинопродюсер и кинооператор. Один из наиболее ярких представителей постмодернизма в кинематографе."
                        }
                ))
                this.actors.addAll(
                        listOf(Actor().apply {
                            this.firstName = "Дже́йми"
                            this.lastName = "Фокс"
                            this.about = "Американский актёр и певец, участник stand-up comedy."
                        })
                )
            },
            Film().apply {
                this.name = "Дом"
                this.tags.addAll(listOf(
                        "фантастика",
                        "комедия",
                        "приключения",
                        "мелодрама"
                ))
                this.imageLink = "https://upload.wikimedia.org/wikipedia/ru/thumb/4/40/Home_2015.jpg/786px-Home_2015.jpg"
                this.video = Video().apply {
                    this.link = "http://kinogo.cc/5469-dom-2015.html"
                    this.preview = "https://upload.wikimedia.org/wikipedia/ru/thumb/4/40/Home_2015.jpg/786px-Home_2015.jpg"
                    this.description = "Инопланетная раса буфов во главе с капитаном Смеком захватывает Землю, чтобы укрыться от своих смертельных врагов-горгов и обрести новый дом. Руководствуясь благими намерениями, бувы начинают переселять расу людей, но одной находчивой девушке по имени Дар удаётся сбежать. В бегах она встречается с изгнанным бувом по имени О."
                }
                this.producers.addAll(listOf(
                        Producer().apply {
                            this.firstName = "Тим"
                            this.lastName = "Джонсон"
                            this.about = "Американский кинорежиссёр, сценарист, актёр, кинопродюсер и кинооператор. Один из наиболее ярких представителей постмодернизма в кинематографе."
                        }
                ))
                this.actors.addAll(
                        listOf(Actor().apply {
                            this.firstName = "Джеймс"
                            this.lastName = "Па́рсонс"
                            this.about = " Американский актёр. Наиболее известен по роли Шелдона Купера в комедийном сериале «Теория большого взрыва»."
                        })
                )
            },
            Film().apply {
                this.name = "Джон Уик"
                this.tags.addAll(listOf(
                        "боевик"
                ))
                this.imageLink = "https://upload.wikimedia.org/wikipedia/ru/thumb/e/e5/%D0%94%D0%B6%D0%BE%D0%BD_%D0%A3%D0%B8%D0%BA.jpg/685px-%D0%94%D0%B6%D0%BE%D0%BD_%D0%A3%D0%B8%D0%BA.jpg"
                this.video = Video().apply {
                    this.link = "http://kinogo.cc/5469-dom-2015.html"
                    this.preview = "https://upload.wikimedia.org/wikipedia/ru/thumb/e/e5/%D0%94%D0%B6%D0%BE%D0%BD_%D0%A3%D0%B8%D0%BA.jpg/685px-%D0%94%D0%B6%D0%BE%D0%BD_%D0%A3%D0%B8%D0%BA.jpg"
                    this.description = "Бывший наёмный убийца Джон Уик потерял в результате неназванной болезни жену Элену. Её посмертным подарком стал щенок Дейзи, вместе с письмом, в котором она надеялась, что пёс поможет ему справиться с потерей. Уик привязывается к щенку, и они проводят целые дни, катаясь на автомобиле 1969 года Ford Mustang Mach 1."
                }
                this.producers.addAll(listOf(
                        Producer().apply {
                            this.firstName = "Чад"
                            this.lastName = "Стахелски"
                            this.about = "Американский режиссёр и каскадёр, известный по работе над серией фильмов «Джон Уик»."
                        }
                ))
                this.actors.addAll(
                        listOf(Actor().apply {
                            this.firstName = "Киану"
                            this.lastName = "Ривз"
                            this.about = "Канадский актёр, кинопродюсер, кинорежиссёр и музыкант (бас-гитарист, бэк-вокалист)."
                        })
                )
            },
            Film().apply {
                this.name = "Матрица"
                this.tags.addAll(listOf(
                        "боевик",
                        "научная фантастика"
                ))
                this.imageLink = "https://upload.wikimedia.org/wikipedia/ru/9/9d/Matrix-DVD.jpg"
                this.video = Video().apply {
                    this.link = "http://kinogo.cc/930-matrica-1999.html"
                    this.preview = "https://upload.wikimedia.org/wikipedia/ru/9/9d/Matrix-DVD.jpg"
                    this.description = "Фильм изображает будущее, в котором реальность, существующая для большинства людей, есть в действительности симуляция типа «мозг в колбе», созданная разумными машинами, чтобы подчинить и усмирить человеческое население, в то время как тепло и электрическая активность их тел используются машинами в качестве источника энергии."
                }
                this.producers.addAll(listOf(
                        Producer().apply {
                            this.firstName = "Ларри"
                            this.lastName = "Вачовски"
                            this.about = "Американские кинорежиссёры, продюсеры и сценаристы."
                        }
                ))
                this.actors.addAll(
                        listOf(Actor().apply {
                            this.firstName = "Киану"
                            this.lastName = "Ривз"
                            this.about = "Канадский актёр, кинопродюсер, кинорежиссёр и музыкант (бас-гитарист, бэк-вокалист)."
                        })
                )
            }
    )

    fun create() {

    }

    fun create(film: Film) {
        Realm.getDefaultInstance().executeTransaction {
            it.insert(film)
        }
    }

    fun get(body: (List<Film>) -> Unit) {
        Realm.getDefaultInstance().executeTransaction {
            body(it.where(Film::class.java).findAll())
        }
    }
}