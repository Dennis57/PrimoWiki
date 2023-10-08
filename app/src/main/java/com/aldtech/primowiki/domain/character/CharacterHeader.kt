package com.aldtech.primowiki.domain.character

import androidx.annotation.DrawableRes
import com.example.primowiki.R

sealed class CharacterHeader(
    val rarity: Int,
    val element: String,
    val characterName: String,
    @DrawableRes val icon: Int
) {

    object Albedo : CharacterHeader(
        rarity = 5,
        element = "Geo",
        characterName = "Albedo",
        icon = R.drawable.ic_albedo
    )

    object Alhaitham : CharacterHeader(
        rarity = 5,
        element = "Dendro",
        characterName = "Alhaitham",
        icon = R.drawable.ic_alhaitham
    )

    object Aloy : CharacterHeader(
        rarity = 5,
        element = "Cryo",
        characterName = "Aloy",
        icon = R.drawable.ic_aloy
    )

    object Amber : CharacterHeader(
        rarity = 4,
        element = "Pyro",
        characterName = "Amber",
        icon = R.drawable.ic_amber
    )

    object AratakiItto : CharacterHeader(
        rarity = 5,
        element = "Geo",
        characterName = "Arataki Itto",
        icon = R.drawable.ic_arataki_itto
    )

    object Ayaka : CharacterHeader(
        rarity = 5,
        element = "Cryo",
        characterName = "Ayaka",
        icon = R.drawable.ic_ayaka
    )

    object Ayato : CharacterHeader(
        rarity = 5,
        element = "Hydro",
        characterName = "Ayato",
        icon = R.drawable.ic_ayato
    )

    object Baizhu : CharacterHeader(
        rarity = 5,
        element = "Dendro",
        characterName = "Baizhu",
        icon = R.drawable.ic_baizhu
    )

    object Barbara : CharacterHeader(
        rarity = 4,
        element = "Hydro",
        characterName = "Barbara",
        icon = R.drawable.ic_barbara
    )

    object Beidou : CharacterHeader(
        rarity = 4,
        element = "Electro",
        characterName = "BeiDou",
        icon = R.drawable.ic_beidou
    )

    object Bennett : CharacterHeader(
        rarity = 4,
        element = "Pyro",
        characterName = "Bennett",
        icon = R.drawable.ic_bennett
    )

    object Candace : CharacterHeader(
        rarity = 4,
        element = "Hydro",
        characterName = "Candace",
        icon = R.drawable.ic_candance
    )

    object Chongyun : CharacterHeader(
        rarity = 4,
        element = "Cryo",
        characterName = "Chongyun",
        icon = R.drawable.ic_chongyun
    )

    object Collei : CharacterHeader(
        rarity = 4,
        element = "Dendro",
        characterName = "Collei",
        icon = R.drawable.ic_collei
    )

    object Cyno : CharacterHeader(
        rarity = 5,
        element = "Electro",
        characterName = "Cyno",
        icon = R.drawable.ic_cyno
    )

    object Dehya : CharacterHeader(
        rarity = 5,
        element = "Pyro",
        characterName = "Dehya",
        icon = R.drawable.ic_dehya
    )

    object Diluc : CharacterHeader(
        rarity = 5,
        element = "Pyro",
        characterName = "Diluc",
        icon = R.drawable.ic_diluc
    )

    object Diona : CharacterHeader(
        rarity = 4,
        element = "Cryo",
        characterName = "Diona",
        icon = R.drawable.ic_diona
    )

    object Dori : CharacterHeader(
        rarity = 4,
        element = "Electro",
        characterName = "Dori",
        icon = R.drawable.ic_dori
    )

    object Eula : CharacterHeader(
        rarity = 5,
        element = "Cryo",
        characterName = "Eula",
        icon = R.drawable.ic_eula
    )

    object Faruzan : CharacterHeader(
        rarity = 4,
        element = "Anemo",
        characterName = "Faruzan",
        icon = R.drawable.ic_faruzan
    )

    object Fischl : CharacterHeader(
        rarity = 4,
        element = "Electro",
        characterName = "Fischl",
        icon = R.drawable.ic_fischl
    )

    object Freminet : CharacterHeader(
        rarity = 4,
        element = "Cryo",
        characterName = "Freminet",
        icon = R.drawable.ic_freminet
    )

    object Ganyu : CharacterHeader(
        rarity = 5,
        element = "Cryo",
        characterName = "Ganyu",
        icon = R.drawable.ic_ganyu
    )

    object Gorou : CharacterHeader(
        rarity = 4,
        element = "Geo",
        characterName = "Gorou",
        icon = R.drawable.ic_gorou
    )

    object HuTao : CharacterHeader(
        rarity = 5,
        element = "Pyro",
        characterName = "Hu Tao",
        icon = R.drawable.ic_hu_tao
    )

    object Jean : CharacterHeader(
        rarity = 5,
        element = "Anemo",
        characterName = "Jean",
        icon = R.drawable.ic_jean
    )

    object Kaeya : CharacterHeader(
        rarity = 4,
        element = "Cryo",
        characterName = "Kaeya",
        icon = R.drawable.ic_kaeya
    )

    object Kaveh : CharacterHeader(
        rarity = 4,
        element = "Dendro",
        characterName = "Kaveh",
        icon = R.drawable.ic_kaveh
    )

    object Kazuha : CharacterHeader(
        rarity = 5,
        element = "Anemo",
        characterName = "Kazuha",
        icon = R.drawable.ic_kazuha
    )

    object Keqing : CharacterHeader(
        rarity = 5,
        element = "Electro",
        characterName = "Keqing",
        icon = R.drawable.ic_keqing
    )

    object Kirara : CharacterHeader(
        rarity = 4,
        element = "Dendro",
        characterName = "Kirara",
        icon = R.drawable.ic_kirara
    )

    object Klee : CharacterHeader(
        rarity = 5,
        element = "Pyro",
        characterName = "Klee",
        icon = R.drawable.ic_klee
    )

    object Kokomi : CharacterHeader(
        rarity = 5,
        element = "Hydro",
        characterName = "Kokomi",
        icon = R.drawable.ic_kokomi
    )

    object KukiShinobu : CharacterHeader(
        rarity = 4,
        element = "Electro",
        characterName = "Kuki Shinobu",
        icon = R.drawable.ic_kuki_shinobu
    )

    object Layla : CharacterHeader(
        rarity = 4,
        element = "Cryo",
        characterName = "Layla",
        icon = R.drawable.ic_layla
    )

    object Lisa : CharacterHeader(
        rarity = 4,
        element = "Electro",
        characterName = "Lisa",
        icon = R.drawable.ic_lisa
    )

    object Lynette : CharacterHeader(
        rarity = 4,
        element = "Anemo",
        characterName = "Lynette",
        icon = R.drawable.ic_lynette
    )

    object Lyney : CharacterHeader(
        rarity = 5,
        element = "Pyro",
        characterName = "Lyney",
        icon = R.drawable.ic_lyney
    )

    object Mika : CharacterHeader(
        rarity = 4,
        element = "Cryo",
        characterName = "Mika",
        icon = R.drawable.ic_mika
    )

    object Mona : CharacterHeader(
        rarity = 5,
        element = "Hydro",
        characterName = "Mona",
        icon = R.drawable.ic_mona
    )

    object Nahida : CharacterHeader(
        rarity = 5,
        element = "Dendro",
        characterName = "Nahida",
        icon = R.drawable.ic_nahida
    )

    object Nilou : CharacterHeader(
        rarity = 5,
        element = "Hydro",
        characterName = "Nilou",
        icon = R.drawable.ic_nilou
    )

    object Ningguang : CharacterHeader(
        rarity = 4,
        element = "Geo",
        characterName = "Ningguang",
        icon = R.drawable.ic_ningguang
    )

    object Noelle : CharacterHeader(
        rarity = 4,
        element = "Geo",
        characterName = "Noelle",
        icon = R.drawable.ic_noelle
    )

    object Qiqi : CharacterHeader(
        rarity = 5,
        element = "Cryo",
        characterName = "Qiqi",
        icon = R.drawable.ic_qiqi
    )

    object Raiden : CharacterHeader(
        rarity = 5,
        element = "Electro",
        characterName = "Raiden",
        icon = R.drawable.ic_raiden
    )

    object Razor : CharacterHeader(
        rarity = 4,
        element = "Electro",
        characterName = "Razor",
        icon = R.drawable.ic_razor
    )

    object Rosaria : CharacterHeader(
        rarity = 4,
        element = "Cryo",
        characterName = "Rosaria",
        icon = R.drawable.ic_rosaria
    )

    object Sara : CharacterHeader(
        rarity = 4,
        element = "Electro",
        characterName = "Kujou Sara",
        icon = R.drawable.ic_sara
    )

    object Shenhe : CharacterHeader(
        rarity = 5,
        element = "Cryo",
        characterName = "Shenhe",
        icon = R.drawable.ic_shenhe
    )

    object ShikanoinHeizou : CharacterHeader(
        rarity = 4,
        element = "Anemo",
        characterName = "Shinanoin Heizou",
        icon = R.drawable.ic_shikanoin_heizou
    )

    object Sucrose : CharacterHeader(
        rarity = 4,
        element = "Anemo",
        characterName = "Sucrose",
        icon = R.drawable.ic_sucrose
    )

    object Tartaglia : CharacterHeader(
        rarity = 5,
        element = "Hydro",
        characterName = "Tartaglia",
        icon = R.drawable.ic_tartaglia
    )

    object Thoma : CharacterHeader(
        rarity = 4,
        element = "Pyro",
        characterName = "Thoma",
        icon = R.drawable.ic_thoma
    )

    object Tighnari : CharacterHeader(
        rarity = 5,
        element = "Dendro",
        characterName = "Tighnari",
        icon = R.drawable.ic_tighnari
    )

    object TravelerAnemo : CharacterHeader(
        rarity = 5,
        element = "Anemo",
        characterName = "Anemo Traveler",
        icon = R.drawable.ic_traveler
    )

    object TravelerDendro : CharacterHeader(
        rarity = 5,
        element = "Dendro",
        characterName = "Dendro Traveler",
        icon = R.drawable.ic_traveler
    )

    object TravelerElectro : CharacterHeader(
        rarity = 5,
        element = "Electro",
        characterName = "Electro Traveler",
        icon = R.drawable.ic_traveler
    )

    object TravelerGeo : CharacterHeader(
        rarity = 5,
        element = "Geo",
        characterName = "Geo Traveler",
        icon = R.drawable.ic_traveler
    )

    object TravelerHydro : CharacterHeader(
        rarity = 5,
        element = "Hydro",
        characterName = "Hydro Traveler",
        icon = R.drawable.ic_traveler
    )

    object Venti : CharacterHeader(
        rarity = 5,
        element = "Anemo",
        characterName = "Venti",
        icon = R.drawable.ic_venti
    )

    object Wanderer : CharacterHeader(
        rarity = 5,
        element = "Anemo",
        characterName = "Wanderer",
        icon = R.drawable.ic_wanderer
    )

    object Xiangling : CharacterHeader(
        rarity = 4,
        element = "Pyro",
        characterName = "Xiangling",
        icon = R.drawable.ic_xiangling
    )

    object Xiao : CharacterHeader(
        rarity = 5,
        element = "Anemo",
        characterName = "Xiao",
        icon = R.drawable.ic_xiao
    )

    object Xingqiu : CharacterHeader(
        rarity = 4,
        element = "Hydro",
        characterName = "Xingqiu",
        icon = R.drawable.ic_xingqiu
    )

    object Xinyan : CharacterHeader(
        rarity = 4,
        element = "Pyro",
        characterName = "Xinyan",
        icon = R.drawable.ic_xinyan
    )

    object YaeMiko : CharacterHeader(
        rarity = 5,
        element = "Electro",
        characterName = "Yae Miko",
        icon = R.drawable.ic_yae_miko
    )

    object Yanfei : CharacterHeader(
        rarity = 4,
        element = "Pyro",
        characterName = "Yanfei",
        icon = R.drawable.ic_yanfei
    )

    object Yaoyao : CharacterHeader(
        rarity = 4,
        element = "Dendro",
        characterName = "Yaoyao",
        icon = R.drawable.ic_yaoyao
    )

    object Yelan : CharacterHeader(
        rarity = 5,
        element = "Hydro",
        characterName = "Yelan",
        icon = R.drawable.ic_yelan
    )

    object Yoimiya : CharacterHeader(
        rarity = 5,
        element = "Pyro",
        characterName = "Yoimiya",
        icon = R.drawable.ic_yoimiya
    )

    object YunJin : CharacterHeader(
        rarity = 4,
        element = "Geo",
        characterName = "Yun Jin",
        icon = R.drawable.ic_yun_jin
    )

    object Zhongli : CharacterHeader(
        rarity = 5,
        element = "Geo",
        characterName = "Zhongli",
        icon = R.drawable.ic_zhongli
    )
}
