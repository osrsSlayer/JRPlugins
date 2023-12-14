package com.piggyplugins.AutoChop

import net.runelite.client.config.Config
import net.runelite.client.config.ConfigGroup
import net.runelite.client.config.ConfigItem
import java.awt.Dimension

@ConfigGroup("AutoChop")
interface AutoChopConfig : Config {
    @ConfigItem(
        keyName = "overlay",
        name = "Overlay",
        description = "Display Overlay?",
        position = 0
    )
    fun displayOverlay(): Boolean = true

    @ConfigItem(
        keyName = "burnLogs",
        name = "Burn Logs?",
        description = "Burn Logs?",
        position = 1
    )
    fun burnLogs(): Boolean = false

    @ConfigItem(
        keyName = "treeName",
        name = "Tree Name",
        description = "Enter the name of the tree to cut",
        position = 2
    )
    fun treeName(): String = "Tree"

    @ConfigItem(
        keyName = "treeAction",
        name = "Tree Action",
        description = "Enter the name of the tree action (cut, Chop down)",
        position = 3
    )
    fun treeAction(): String = "Chop down"

    @ConfigItem(
        keyName = "logName",
        name = "Log Name",
        description = "Enter the name of the log",
        position = 4
    )
    fun logName(): String = "Maple logs"

    @ConfigItem(
        keyName = "treeAreaX&Y",
        name = "Tree AreaX&Y",
        description = "Enter the Tree areaX&Y",
        position = 5
    )
    fun treeAreaXY(): Dimension = Dimension(3151, 3450)

    @ConfigItem(
        keyName = "treeAreaW&H",
        name = "Tree AreaW&H",
        description = "Enter the Tree areaW&H",
        position = 6
    )
    fun treeAreaWH(): Dimension = Dimension(20, 15)

    @ConfigItem(
        keyName = "treeLocationXY",
        name = "Tree LocationXY",
        description = "Enter the tree X & Y",
        position = 7,
    )
    fun treeLocation(): Dimension = Dimension(0,0)

    @ConfigItem(
        keyName = "bankLocationXY",
        name = "Bank LocationXY",
        description = "Enter the bank location XY",
        position = 8
    )
    fun bankLocation(): Dimension = Dimension(3182, 3444)

    @ConfigItem(
        keyName = "bankAreaX&Y",
        name = "Bank AreaX&Y",
        description = "Enter the bank area X&Y",
        position = 9
    )
    fun bankAreaXY(): Dimension = Dimension(3180, 3432)

    @ConfigItem(
        keyName = "bankAreaW&H",
        name = "Bank AreaW&H",
        description = "Enter the bank area W&H",
        position = 10
    )
    fun bankAreaWH(): Dimension = Dimension(5, 12)

    @ConfigItem(
        keyName = "bankAreaPlane",
        name = "Bank Plane",
        description = "Enter the bank plane",
        position = 11
    )
    fun bankAreaPlane(): Int = 0

    @ConfigItem(
        keyName = "treeAreaPlane",
        name = "Tree Plane",
        description = "Enter the tree plane",
        position = 12,
    )
    fun treeAreaPlane(): Int = 0


}