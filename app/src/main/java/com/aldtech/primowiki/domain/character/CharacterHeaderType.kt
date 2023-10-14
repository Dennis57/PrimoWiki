package com.aldtech.primowiki.domain.character

import androidx.annotation.DrawableRes
import com.example.primowiki.R

sealed class CharacterHeaderType(
    val rarity: Int,
    val element: String,
    val characterName: String,
    @DrawableRes val icon: Int
) {

    object Albedo : CharacterHeaderType(
        rarity = 5,
        element = "Geo",
        characterName = "Albedo",
        icon = R.drawable.ic_albedo
    )

    object Alhaitham : CharacterHeaderType(
        rarity = 5,
        element = "Dendro",
        characterName = "Alhaitham",
        icon = R.drawable.ic_alhaitham
    )

    object Aloy : CharacterHeaderType(
        rarity = 5,
        element = "Cryo",
        characterName = "Aloy",
        icon = R.drawable.ic_aloy
    )

    object Amber : CharacterHeaderType(
        rarity = 4,
        element = "Pyro",
        characterName = "Amber",
        icon = R.drawable.ic_amber
    )

    object AratakiItto : CharacterHeaderType(
        rarity = 5,
        element = "Geo",
        characterName = "Arataki Itto",
        icon = R.drawable.ic_arataki_itto
    )

    object Ayaka : CharacterHeaderType(
        rarity = 5,
        element = "Cryo",
        characterName = "Ayaka",
        icon = R.drawable.ic_ayaka
    )

    object Ayato : CharacterHeaderType(
        rarity = 5,
        element = "Hydro",
        characterName = "Ayato",
        icon = R.drawable.ic_ayato
    )

    object Baizhu : CharacterHeaderType(
        rarity = 5,
        element = "Dendro",
        characterName = "Baizhu",
        icon = R.drawable.ic_baizhu
    )

    object Barbara : CharacterHeaderType(
        rarity = 4,
        element = "Hydro",
        characterName = "Barbara",
        icon = R.drawable.ic_barbara
    )

    object Beidou : CharacterHeaderType(
        rarity = 4,
        element = "Electro",
        characterName = "BeiDou",
        icon = R.drawable.ic_beidou
    )

    object Bennett : CharacterHeaderType(
        rarity = 4,
        element = "Pyro",
        characterName = "Bennett",
        icon = R.drawable.ic_bennett
    )

    object Candace : CharacterHeaderType(
        rarity = 4,
        element = "Hydro",
        characterName = "Candace",
        icon = R.drawable.ic_candance
    )

    object Chongyun : CharacterHeaderType(
        rarity = 4,
        element = "Cryo",
        characterName = "Chongyun",
        icon = R.drawable.ic_chongyun
    )

    object Collei : CharacterHeaderType(
        rarity = 4,
        element = "Dendro",
        characterName = "Collei",
        icon = R.drawable.ic_collei
    )

    object Cyno : CharacterHeaderType(
        rarity = 5,
        element = "Electro",
        characterName = "Cyno",
        icon = R.drawable.ic_cyno
    )

    object Dehya : CharacterHeaderType(
        rarity = 5,
        element = "Pyro",
        characterName = "Dehya",
        icon = R.drawable.ic_dehya
    )

    object Diluc : CharacterHeaderType(
        rarity = 5,
        element = "Pyro",
        characterName = "Diluc",
        icon = R.drawable.ic_diluc
    )

    object Diona : CharacterHeaderType(
        rarity = 4,
        element = "Cryo",
        characterName = "Diona",
        icon = R.drawable.ic_diona
    )

    object Dori : CharacterHeaderType(
        rarity = 4,
        element = "Electro",
        characterName = "Dori",
        icon = R.drawable.ic_dori
    )

    object Eula : CharacterHeaderType(
        rarity = 5,
        element = "Cryo",
        characterName = "Eula",
        icon = R.drawable.ic_eula
    )

    object Faruzan : CharacterHeaderType(
        rarity = 4,
        element = "Anemo",
        characterName = "Faruzan",
        icon = R.drawable.ic_faruzan
    )

    object Fischl : CharacterHeaderType(
        rarity = 4,
        element = "Electro",
        characterName = "Fischl",
        icon = R.drawable.ic_fischl
    )

    object Freminet : CharacterHeaderType(
        rarity = 4,
        element = "Cryo",
        characterName = "Freminet",
        icon = R.drawable.ic_freminet
    )

    object Ganyu : CharacterHeaderType(
        rarity = 5,
        element = "Cryo",
        characterName = "Ganyu",
        icon = R.drawable.ic_ganyu
    )

    object Gorou : CharacterHeaderType(
        rarity = 4,
        element = "Geo",
        characterName = "Gorou",
        icon = R.drawable.ic_gorou
    )

    object HuTao : CharacterHeaderType(
        rarity = 5,
        element = "Pyro",
        characterName = "Hu Tao",
        icon = R.drawable.ic_hu_tao
    )

    object Jean : CharacterHeaderType(
        rarity = 5,
        element = "Anemo",
        characterName = "Jean",
        icon = R.drawable.ic_jean
    )

    object Kaeya : CharacterHeaderType(
        rarity = 4,
        element = "Cryo",
        characterName = "Kaeya",
        icon = R.drawable.ic_kaeya
    )

    object Kaveh : CharacterHeaderType(
        rarity = 4,
        element = "Dendro",
        characterName = "Kaveh",
        icon = R.drawable.ic_kaveh
    )

    object Kazuha : CharacterHeaderType(
        rarity = 5,
        element = "Anemo",
        characterName = "Kazuha",
        icon = R.drawable.ic_kazuha
    )

    object Keqing : CharacterHeaderType(
        rarity = 5,
        element = "Electro",
        characterName = "Keqing",
        icon = R.drawable.ic_keqing
    )

    object Kirara : CharacterHeaderType(
        rarity = 4,
        element = "Dendro",
        characterName = "Kirara",
        icon = R.drawable.ic_kirara
    )

    object Klee : CharacterHeaderType(
        rarity = 5,
        element = "Pyro",
        characterName = "Klee",
        icon = R.drawable.ic_klee
    )

    object Kokomi : CharacterHeaderType(
        rarity = 5,
        element = "Hydro",
        characterName = "Kokomi",
        icon = R.drawable.ic_kokomi
    )

    object KukiShinobu : CharacterHeaderType(
        rarity = 4,
        element = "Electro",
        characterName = "Kuki Shinobu",
        icon = R.drawable.ic_kuki_shinobu
    )

    object Layla : CharacterHeaderType(
        rarity = 4,
        element = "Cryo",
        characterName = "Layla",
        icon = R.drawable.ic_layla
    )

    object Lisa : CharacterHeaderType(
        rarity = 4,
        element = "Electro",
        characterName = "Lisa",
        icon = R.drawable.ic_lisa
    )

    object Lynette : CharacterHeaderType(
        rarity = 4,
        element = "Anemo",
        characterName = "Lynette",
        icon = R.drawable.ic_lynette
    )

    object Lyney : CharacterHeaderType(
        rarity = 5,
        element = "Pyro",
        characterName = "Lyney",
        icon = R.drawable.ic_lyney
    )

    object Mika : CharacterHeaderType(
        rarity = 4,
        element = "Cryo",
        characterName = "Mika",
        icon = R.drawable.ic_mika
    )

    object Mona : CharacterHeaderType(
        rarity = 5,
        element = "Hydro",
        characterName = "Mona",
        icon = R.drawable.ic_mona
    )

    object Nahida : CharacterHeaderType(
        rarity = 5,
        element = "Dendro",
        characterName = "Nahida",
        icon = R.drawable.ic_nahida
    )

    object Nilou : CharacterHeaderType(
        rarity = 5,
        element = "Hydro",
        characterName = "Nilou",
        icon = R.drawable.ic_nilou
    )

    object Ningguang : CharacterHeaderType(
        rarity = 4,
        element = "Geo",
        characterName = "Ningguang",
        icon = R.drawable.ic_ningguang
    )

    object Noelle : CharacterHeaderType(
        rarity = 4,
        element = "Geo",
        characterName = "Noelle",
        icon = R.drawable.ic_noelle
    )

    object Qiqi : CharacterHeaderType(
        rarity = 5,
        element = "Cryo",
        characterName = "Qiqi",
        icon = R.drawable.ic_qiqi
    )

    object Raiden : CharacterHeaderType(
        rarity = 5,
        element = "Electro",
        characterName = "Raiden",
        icon = R.drawable.ic_raiden
    )

    object Razor : CharacterHeaderType(
        rarity = 4,
        element = "Electro",
        characterName = "Razor",
        icon = R.drawable.ic_razor
    )

    object Rosaria : CharacterHeaderType(
        rarity = 4,
        element = "Cryo",
        characterName = "Rosaria",
        icon = R.drawable.ic_rosaria
    )

    object Sara : CharacterHeaderType(
        rarity = 4,
        element = "Electro",
        characterName = "Kujou Sara",
        icon = R.drawable.ic_sara
    )

    object Shenhe : CharacterHeaderType(
        rarity = 5,
        element = "Cryo",
        characterName = "Shenhe",
        icon = R.drawable.ic_shenhe
    )

    object ShikanoinHeizou : CharacterHeaderType(
        rarity = 4,
        element = "Anemo",
        characterName = "Shinanoin Heizou",
        icon = R.drawable.ic_shikanoin_heizou
    )

    object Sucrose : CharacterHeaderType(
        rarity = 4,
        element = "Anemo",
        characterName = "Sucrose",
        icon = R.drawable.ic_sucrose
    )

    object Tartaglia : CharacterHeaderType(
        rarity = 5,
        element = "Hydro",
        characterName = "Tartaglia",
        icon = R.drawable.ic_tartaglia
    )

    object Thoma : CharacterHeaderType(
        rarity = 4,
        element = "Pyro",
        characterName = "Thoma",
        icon = R.drawable.ic_thoma
    )

    object Tighnari : CharacterHeaderType(
        rarity = 5,
        element = "Dendro",
        characterName = "Tighnari",
        icon = R.drawable.ic_tighnari
    )

    object TravelerAnemo : CharacterHeaderType(
        rarity = 5,
        element = "Anemo",
        characterName = "Anemo Traveler",
        icon = R.drawable.ic_traveler
    )

    object TravelerDendro : CharacterHeaderType(
        rarity = 5,
        element = "Dendro",
        characterName = "Dendro Traveler",
        icon = R.drawable.ic_traveler
    )

    object TravelerElectro : CharacterHeaderType(
        rarity = 5,
        element = "Electro",
        characterName = "Electro Traveler",
        icon = R.drawable.ic_traveler
    )

    object TravelerGeo : CharacterHeaderType(
        rarity = 5,
        element = "Geo",
        characterName = "Geo Traveler",
        icon = R.drawable.ic_traveler
    )

    object TravelerHydro : CharacterHeaderType(
        rarity = 5,
        element = "Hydro",
        characterName = "Hydro Traveler",
        icon = R.drawable.ic_traveler
    )

    object Venti : CharacterHeaderType(
        rarity = 5,
        element = "Anemo",
        characterName = "Venti",
        icon = R.drawable.ic_venti
    )

    object Wanderer : CharacterHeaderType(
        rarity = 5,
        element = "Anemo",
        characterName = "Wanderer",
        icon = R.drawable.ic_wanderer
    )

    object Xiangling : CharacterHeaderType(
        rarity = 4,
        element = "Pyro",
        characterName = "Xiangling",
        icon = R.drawable.ic_xiangling
    )

    object Xiao : CharacterHeaderType(
        rarity = 5,
        element = "Anemo",
        characterName = "Xiao",
        icon = R.drawable.ic_xiao
    )

    object Xingqiu : CharacterHeaderType(
        rarity = 4,
        element = "Hydro",
        characterName = "Xingqiu",
        icon = R.drawable.ic_xingqiu
    )

    object Xinyan : CharacterHeaderType(
        rarity = 4,
        element = "Pyro",
        characterName = "Xinyan",
        icon = R.drawable.ic_xinyan
    )

    object YaeMiko : CharacterHeaderType(
        rarity = 5,
        element = "Electro",
        characterName = "Yae Miko",
        icon = R.drawable.ic_yae_miko
    )

    object Yanfei : CharacterHeaderType(
        rarity = 4,
        element = "Pyro",
        characterName = "Yanfei",
        icon = R.drawable.ic_yanfei
    )

    object Yaoyao : CharacterHeaderType(
        rarity = 4,
        element = "Dendro",
        characterName = "Yaoyao",
        icon = R.drawable.ic_yaoyao
    )

    object Yelan : CharacterHeaderType(
        rarity = 5,
        element = "Hydro",
        characterName = "Yelan",
        icon = R.drawable.ic_yelan
    )

    object Yoimiya : CharacterHeaderType(
        rarity = 5,
        element = "Pyro",
        characterName = "Yoimiya",
        icon = R.drawable.ic_yoimiya
    )

    object YunJin : CharacterHeaderType(
        rarity = 4,
        element = "Geo",
        characterName = "Yun Jin",
        icon = R.drawable.ic_yun_jin
    )

    object Zhongli : CharacterHeaderType(
        rarity = 5,
        element = "Geo",
        characterName = "Zhongli",
        icon = R.drawable.ic_zhongli
    )

    companion object {
        fun fromWMO(code: String): CharacterHeaderType {
            return when(code) {
                "albedo" -> Albedo
                else -> Alhaitham
            }
        }
    }
}
