package com.yt.greenarchitectapp.model

import android.os.Parcelable
import com.yt.greenarchitectapp.R
import kotlinx.parcelize.Parcelize

@Parcelize
data class Vegetables(
    val name: String,
    val info: String,
    val nurseries: List<Nursery>,
    val image: Int,
    val listOFImages: List<Int>
) : Parcelable

@Parcelize
data class Nursery(
    val name: String,
    val url: String
) : Parcelable

val listOfVegetables = listOf(
    Vegetables(
        "Кукуруза ранняя\nЛАКОМКА",
        "Раннеспелый, высокоурожайный сорт сахарной кукурузы. Початок слабо конической формы, средней массой 200 г, длиной 18-20 см. Зерно желто-оранжевое, кожица зерна нежная, мякоть сладкая. Рекомендуется в свежем, консервированном виде, для замораживания. Вкусовые качества вареной и консервированной продукции хорошие. Урожайность чистых кондиционных початков 40-54 ц/га.",
        nurseries = emptyList(),
        R.drawable.p11,
        listOf(
            R.drawable.p11,
            R.drawable.p12,
            R.drawable.p12
        )
    ),

    Vegetables(
        "Редис\nГЛОРИЕТ F1",
        "Гибрид редиса среднераннего срока созревания. Срок созревания 20 дней. Корнеплоды хорошо выравнены по размеру и форме, красного цвета – имеют отличный товарный вид. Долго не образует пустот. Форма округлая, диаметр 2,5-5,0 см Поверхность очень гладкая Внутренняя окраска - белая Высота ботвы 10-12 см, полу-прямостоячая\nДополнительная информация: Рекомендуется для выращивания в открытом грунте весной, летом и осенью. Промежуточная устойчивость к фузариозу Норма высева 1,6-2,0 млн семян на га Устойчив к растрескиванию.",
        nurseries = emptyList(),
        R.drawable.p21,
        listOf(
            R.drawable.p21,
            R.drawable.p22,
            R.drawable.p22
        )
    ),

    Vegetables(
        "Перец\nГЕРАКЛ",
        "Высокоурожайный сорт для открытого и защищенного грунта. Вегетационный период 135-145 дней. Плод кубовидной формы, длиной 11-12 см, шириной 10-11 см, толщина стенок 5-7 мм. Окраска в биологической спелости красная, в технической – зеленая. Превосходные вкусовые качества. Универсальное использование.",
        nurseries = emptyList(),
        R.drawable.p31,
        listOf(
            R.drawable.p31,
            R.drawable.p32,
            R.drawable.p32
        )
    ),

    Vegetables(
        "Баклажан\nАЛМАЗ",
        "Среднеспелый, от всходов до созревания плодов 110-150 дней. Растение компактное, высотой 45-50 см. Плод цилиндрический длинной 14,4-17,5 см. Массой 100-160 г. Окраска в технической спелости темно-фиолетовая. Мякоть зеленоватая, плотная, без горечи. Вкусовые и технологические качества отличные. Характеризуется высоким ранним урожаем.",
        nurseries = emptyList(),
        R.drawable.p41,
        listOf(
            R.drawable.p41,
            R.drawable.p42,
            R.drawable.p42
        )
    ),

    Vegetables(
        "Капуста\nАМАГЕР",
        "Позднеспелый, лежкий сорт. Вегетационный период 95-115 дней. Листья серо-зелёные с восковым налётом. Кочаны округо-плоские, плотные, зелено-белые, массой 3-4,5 кг. Устойчив к растрескиванию. Транспортабельность высокая. Рекомендуется для использования в свежем виде и для хранения (до 5 месяцев).",
        nurseries = emptyList(),
        R.drawable.p51,
        listOf(
            R.drawable.p51,
            R.drawable.p52,
            R.drawable.p52
        )
    ),

    Vegetables(
        "Кабачок\nИЗУМРУД",
        "Раннеспелый сорт. Период от полных всходов до начала технической спелости плодов 33-46 дней. Растение кустовое. Плод цилиндрической формы, темно-зеленой окраски с мелкими пятнышками, длинный, среднего диаметра, гладкий, глянцевый, массой 0,9-1,3 кг.",
        nurseries = emptyList(),
        R.drawable.p71,
        listOf(
            R.drawable.p71,
            R.drawable.p72,
            R.drawable.p72
        )
    ),


    Vegetables(
        "Капуста\nЧАМП",
        "Новый ранний гибрид для свежего рынка. Созревает через 52-57 дней после пересадки. Растение компактное. Кочаны правильной округлой формы с привлекательной зеленой окраской. Масса кочанов 1-2 кг в зависимости от условий выращивания и плотности посадки. Кочерыжка очень короткая. Гибрид выделяется чрезвычайно высокой плотностью кочанов, превосходной сохраняемостью на корню в поле и толерантностью к растрескиванию. Может храниться в срезанном состоянии достаточно продолжительный период.",
        nurseries = emptyList(),
        R.drawable.p81,
        listOf(
            R.drawable.p81,
            R.drawable.p82,
            R.drawable.p82
        )
    ),

    Vegetables(
        "Тыква\nВИТАМИННАЯ",
        "Высокоурожайный позднеспелый сорт. Период созревания 125-130 дней. Растение длинноплетистое, средней мощности. Плоды короткоовальные и цилиндрические, широкие, сегментированные, с ребристостью к плодоножке. При полном созревании окраска буро-коричневая с розовым оттенком. Кора тонкая, кожистая. Мякоть ярко-оранжевая, хрустящая, сладкая, толщиной 5-10см. Масса 6-7 кг.",
        nurseries = emptyList(),
        R.drawable.p91,
        listOf(
            R.drawable.p91,
            R.drawable.p92,
            R.drawable.p92
        )
    ),

    Vegetables(
        "Огурец\nМАША",
        "F1 партенокарпический, суперранний из корнишонов, 8-10см., без горечи, с женским типом цветения.",
        nurseries = emptyList(),
        R.drawable.p101,
        listOf(
            R.drawable.p101,
            R.drawable.p102,
            R.drawable.p102
        )
    ),
    Vegetables(
        "Морковь\nРУССКАЯ",
        "Крупная, сочная, сладкая- вот она мечта огородника! На легких, плодородных почвах вырастает длиной не менее 30 см и массой 1 кг! Поверхность ярко-оранжевая, гладкая, сердцевина небольшая. Несмотря на внушительные габариты, мякоть корнеплода нежная, вкусовые качества не разочаруют самого взыскательного гурмана. Агротехника. Посев: апрель-май, схема 45х5 см. Глубина заделки: 1,5-2 см. Оптимальная температура прорастания: t=16-20. Почвы: легкие, слабокислые, хорошо обработанные, удобренные органикой в предыдущий год. Для достижения корнеплодами максимальных размеров необходимо своевременное прореживание, достаточный полив и рыхление. не допускать переувлажнения почвы в конце вегетации.",
        nurseries = emptyList(),
        R.drawable.p111,
        listOf(
            R.drawable.p111,
            R.drawable.p112,
            R.drawable.p112
        )
    ),

    Vegetables(
        "Цветная капуста\nИДЕАЛ F1",
        "Раннеспелый, высокоурожайный. Головка округло-плоская, полностью покрыта листьями, плотная, белоснежная, массой до 1,5 кг. Вкусовые качества отличные. Гибрид устойчив к болезням, рекомендуется для употребления в свежем виде и переработки. АГРОТЕХНИКА: Цветная капуста очень требовательна к питанию и влаге, не выносит кислых почв. Посев на рассаду проводят в середине марта. Через 7-10 дней после появления всходов сеянцы пикируют. Рассада готова к посадке через 35-40 дней после всходов. Сажают ее в конце апреля, по схеме 35х50 см. Дальнейший уход заключается в поливе, прополке, рыхлении и регулярной подкормке. Обязательно притенение головок: 2 листа надламывают или связывают над головкой.",
        nurseries = emptyList(),
        R.drawable.p121,
        listOf(
            R.drawable.p121,
            R.drawable.p122,
            R.drawable.p122
        )
    ),

    Vegetables(
        "Томат желтый\nЧЕРРИ ВИШНЯ",
        "Раннеспелый (92-96 дней от всходов до плодоношения) высокорослый (более 200 см) сорт, предпочтителен для выращивания в пленочных теплицах и открытом грунте (с подвязкой к кольям). Выращивают рассадным способом. После высадки растение собираем в один стебель, удаляя все «пасынки». Плоды округлой формы, желтого цвета, масса 15-20 г. Особую декоративность растений составляет тонкая и длинная кисть с 20-40 плодами, которые имеют более сладкий, сладкий вкус. Урожайность одного растения 1,0- 2,0 кг.",
        nurseries = emptyList(),
        R.drawable.p131,
        listOf(
            R.drawable.p131,
            R.drawable.p132,
            R.drawable.p132
        )
    ),

    Vegetables(
        "Свекла\nБОРДО 237",
        "Среднеранний (62–116 дней от всходов до технической спелости) сорт. Выращивают посевом в открытый грунт на глубину 2,0–2,5 см. Розетка листьев полустоячая, средней величины. Корнеплод округлый, с небольшой головкой, массой 230–500 г. Мякоть интенсивно-темно-красная, с хорошими вкусовыми качествами. Корнеплод погружен в почву наполовину. Сорт относительно устойчив к болезням корнеплодов. Характеризуется хорошей лежкостью при зимнем хранении, сравнительной жаростойкостью. Рекомендован для использования в кулинарии и для переработки. Урожайность 3,5–8,0 кг/м2.",
        nurseries = emptyList(),
        R.drawable.p141,
        listOf(
            R.drawable.p141,
            R.drawable.p141,
            R.drawable.p141
        )
    )
)
