package com.aldtech.primowiki.data.mappers

import com.aldtech.primowiki.data.remote.CharacterHeaderDto
import com.aldtech.primowiki.domain.character.CharacterHeaderInfo
import com.aldtech.primowiki.domain.character.CharacterHeaderType

private data class IndexedCharacterData(
    val index: Int,
    val characterData: CharacterHeaderType
)

fun CharacterHeaderDto.toCharacterData(): Map<Int, List<CharacterHeaderType>> {
    return characterList.mapIndexed { index, character ->
        IndexedCharacterData(
            index = index,
            characterData = CharacterHeaderType.fromWMO(character)
        )

    }.groupBy {
        it.index
    }.mapValues { it ->
        it.value.map {
            it.characterData
        }
    }.also {
        println(it.values)
    }
}

fun CharacterHeaderDto.toCharacterInfo(): CharacterHeaderInfo {
    val characterDataMap = toCharacterData()

    return CharacterHeaderInfo(
        characterHeaderData = characterDataMap
    )
}