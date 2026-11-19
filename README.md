# Fantasy Cultures

New fantasy cultures for **[Millénaire](https://github.com/Kinniken/Millenaire)** 9.1.1 on Minecraft 1.21.1 (NeoForge).

It comes in two parts:
- a **Millénaire content pack** (`fantasy-civs`) with the cultures themselves: buildings, villagers, villages, trade and names
- a small companion **NeoForge mod** (`fantasy_civs`) that will hold any custom blocks and items the cultures need

> **Work in progress.** Early version of the mod with work started only on the Orcish culture.

## Cultures

### Orcish
Tribal warcamps of round spruce-and-earth lodges that grow into stone and bone halls. Every adult orc fights, and they speak Old Celtic (Old Irish).

The village type `warcamp` currently has these buildings, all at their first level. A new warcamp starts with one of each; as it grows it builds a second of every hut and work site.

| Building | Residents |
|---|---|
| Warlord's Hall (town hall) | Warlord, Chieftess |
| Builder's Hut | Builder, Orc Woman |
| Lumberjack Hut | Lumberjack, Orc Woman |
| Spruce Grove | — (worked by the Lumberjack) |
| Miner's Hut | Miner, Orc Woman |
| Mine | — (worked by the Miner) |

- **Walls:** an earthwork wall with towers, corners, gates, slopes and end pieces rings the camp, and border posts mark its outer edge. The Grove, Mine and work huts sit outside the wall.
- **Villagers:** orcs are larger than humans (adults 15 %, the Warlord 25 %) and every adult fights and joins raids. Orc boys and girls are born in the huts and grow up into the village's jobs. Only Builders build.
- **Trade:** the Warlord's Hall sells and buys spruce, stone, cobblestone, gravel and earth goods. The Miner smelts his cobblestone into stone with spruce from the Lumberjack.

Warcamps don't spawn naturally yet. Spawn one with `/millenaire spawn warcamp`.

**Known gap:** the orc villager skins are not included yet, so the villagers show missing textures until original skins are added.

Elves and dwarves are planned.

## Installation
You need Minecraft **1.21.1** with **NeoForge** and **Millénaire 9.1.1**.

1. Copy `mods/fantasy_civs-<version>.jar` into your instance's `mods/` folder.
2. Copy the `millenaire-custom/fantasy-civs/` folder into your instance's `millenaire-custom/` folder. Millénaire creates `millenaire-custom/` on its first start.
3. Start the game. Millénaire reads content when a world starts, so restart the world after updating.

To check the pack loaded, open `millenaire-custom/_validation_report.txt` in your instance. The Orcish culture should be listed with no `!!` problems.

## Repository layout

| Path | Contents |
|---|---|
| `millenaire-custom/fantasy-civs/` | The content pack, ready to copy into the game folder |
| `mods/` | The compiled companion mod |
| `mod/` | Source code of the companion mod |

## Building the mod from source
The mod is a standard NeoForge ModDevGradle project that needs **Java 21**.

```
cd mod
./gradlew build        (Windows: gradlew.bat build)
```

The jar ends up in `mod/build/libs/`.

## License
**All Rights Reserved.** You may download and use this for personal play. Copying, modifying, redistributing or including it in modpacks needs permission. See [LICENSE](LICENSE).

## Credits
- Millénaire is made by Kinniken and contributors. This project is an independent add-on and contains none of Millénaire's own files.
- The NeoForge mod template (`mod/TEMPLATE_LICENSE.txt`) is used under its own licence.
