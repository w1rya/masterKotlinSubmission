package com.wiryawan.picodiploma.submission.model

import com.wiryawan.picodiploma.submission.R

object MobosData {

    private val moboNames = arrayOf (
        "ROG Crosshair VIII Formula",
        "ROG Crosshair VIII Hero",
        "ROG Strix X570-E Gaming",
        "ROG Strix X570-I Gaming",
        "ROG Maximus XI Code",
        "ROG Maximus XI Gene",
        "ROG Zenith Extreme",
        "ROG Zenith Extreme Alpha",
        "ROG Strix X299-E Gaming II",
        "ROG Rampage VI Extreme Encore"
        )

    private val moboDetails = arrayOf (
        "AMD X570 ATX gaming motherboard with PCIe 4.0, 16 power stages , OptiMem III, on-board Wi-Fi 6 (802.11ax), 5 Gbps LAN, USB 3.2, SATA, M.2, ASUS NODE and Aura Sync RGB lighting",
        "AMD X570 ATX gaming motherboard with PCIe 4.0, 16 power stages , OptiMem III, 2.5 Gbps LAN, USB 3.2, SATA, M.2, and Aura Sync RGB lighting",
        "AMD X570 ATX gaming motherboard with PCIe 4.0, 2.5 Gbps and Intel Gigabit LAN, Wi-Fi 6 (802.11ax), 16 power stages, dual M.2 with heatsinks, SATA 6Gb/s, USB 3.2 Gen 2 and Aura Sync RGB lighting",
        "AMD X570 mini-ITX Gaming motherboard with PCIe 4.0, Aura Sync RGB, Intel Gigabit Ethernet, Wi-Fi 6 (802.11ax), M.2 Audio Combo Card, HDMI 2.0, DisplayPort 1.4, SATA 6Gb/s, and USB 3.2 Gen2.",
        "Intel Z390 ATX Gaming motherboard with M.2 heatsink, Aura Sync RGB LED, DDR4 4400MHz, 802.11ac Wi-Fi , dual M.2, SATA 6Gb/s, and USB 3.1 Gen 2",
        "Intel Z390 mATX gaming motherboard with 802.11ac Wi-Fi, double-capacity DIMM support, ROG DIMM.2 dual M.2 expansion card, Aura Sync RGB LED, DDR4 4800MHz, four M.2, SATA 6Gbps, HDMI and USB 3.1 Gen 2",
        "AMD X399 EATX Gaming Motherboard with M.2 heatsink, Aura Sync RGB LED, 802.11ad Wi-Fi, DDR4 3600MHz, triple M.2, 10G Lan card, U.2 and USB 3.1 Gen 2",
        "AMD X399 EATX gaming motherboard for AMD Ryzen™ Threadripper™ processors, with ROG DIMM.2, DDR4 3600MHz , onboard 802.11ac Wi-Fi, 10Gbps LAN, USB 3.1 Gen 2, SATA, Triple M.2 and Aura Sync RGB lighting",
        "Intel X299 ATX motherboard LGA 2066 for Intel Core X-series processors, with 12 power stages, on-board Wi-Fi 6 (802.11ax), 2.5 Gbps LAN, USB 3.2 Gen 2, SATA, three M.2, OLED and Aura Sync RGB lighting",
        "Intel X299 E-ATX motherboard LGA 2066 for Intel Core X-series processors, with 16 power stages, onboard Wi-Fi 6 (802.11ax), 10 Gbps Ethernet, USB 3.2 Gen 2x2, dual USB 3.2 Gen 2 front panel connectors, SATA, quad M.2 and Aura Sync RGB lighting"
    )

    private val moboImages = intArrayOf(
        R.drawable.crosshair_formula,
        R.drawable.crosshair_hero,
        R.drawable.x570_e,
        R.drawable.x570_i,
        R.drawable.maximus_code,
        R.drawable.maximus_gene,
        R.drawable.zenith_extreme,
        R.drawable.zenith_extreme_alpha,
        R.drawable.x299_e_gaming_ii,
        R.drawable.rampage_extreme_encore
    )

    val listData:ArrayList<Mobo>
    get() {
        val list = arrayListOf<Mobo>()
        for (position in moboNames.indices) {
            val mobo = Mobo()
            mobo.name = moboNames[position]
            mobo.detail = moboDetails[position]
            mobo.photo = moboImages[position]
            list.add(mobo)
        }
        return list
    }

}
