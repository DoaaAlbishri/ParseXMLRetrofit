package com.example.parsexmlretrofit

import org.simpleframework.xml.Element
import org.simpleframework.xml.Root
import java.io.Serializable

@Root(name = "entry", strict = false)
class Entry @JvmOverloads constructor(
    @field:Element(name = "summary")
    @param:Element(name = "summary")
    var summary: String? = null,

    @field:Element(name = "updated")
    @param:Element(name = "updated")
    var updated: String? = null,

    @field:Element(name = "id")
    @param:Element(name = "id")
    private val id: String? = null,

    @field:Element(name = "title")
    @param:Element(name = "title")
    var title: String? = null,

    @field:Element(required = false, name = "author")
    @param:Element(name = "author")
    var author: Author? = null

) : Serializable {


}