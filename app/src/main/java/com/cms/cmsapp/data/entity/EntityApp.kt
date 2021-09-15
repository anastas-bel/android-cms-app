package com.cms.cmsapp.data.entity

data class EntityApp(
    val menu_data: Map<String, List<EntityItem>>,
    val menu_sync: Boolean,
    val tab_data: List<TabData>
)