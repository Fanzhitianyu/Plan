/*
 *  This file is part of Player Analytics (Plan).
 *
 *  Plan is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License v3 as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Plan is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with Plan. If not, see <https://www.gnu.org/licenses/>.
 */
package com.djrapitops.plan.settings.locale.lang;

/**
 * Lang enum for all text included in the html files.
 *
 * @author Rsl1122
 */
public enum HtmlLang implements Lang {

    TITLE_NETWORK("Network"),
    // Network Page Navigation
    SIDE_INFORMATION("INFORMATION"), // Nav group title
    SIDE_NETWORK_OVERVIEW("Network Overview"),
    SIDE_SERVERS("Servers"),
    SIDE_OVERVIEW("Overview"),
    SIDE_SESSIONS("Sessions"),
    SIDE_PLAYERBASE("Playerbase"),
    SIDE_PLAYER_LIST("Player List"),
    SIDE_PLAYERBASE_OVERVIEW("Playerbase Overview"),
    SIDE_GEOLOCATIONS("Geolocations"),
    SIDE_PLUGINS("PLUGINS"), // Nav group title
    UNIT_NO_DATA("No Data"), // Generic
    // Modals
    TITLE_THEME_SELECT("Theme Select"),
    LINK_NIGHT_MODE("Night Mode"),
    TEXT_PLUGIN_INFORMATION("Information about the plugin"),
    TEXT_LICENSED_UNDER("is developed and licensed under"),
    LINK_WIKI("Plan Wiki, Tutorials & Documentation"),
    LINK_ISSUES("Report Issues"),
    LINK_DISCORD("General Support on Discord"),
    TEXT_DEVELOPED_BY("is developed by"),
    TEXT_CONTRIBUTORS_THANKS("In addition following <span class=\"col-plan\">awesome people</span> have contributed:"),
    TEXT_CONTRIBUTORS_CODE("code contributor"),
    TEXT_CONTRIBUTORS_LOCALE("translator"),
    TEXT_CONTRIBUTORS_MONEY("Extra special thanks to those who have monetarily supported the development."),
    TEXT_METRICS("bStats Metrics"),
    TITLE_VERSION("Version"),
    TITLE_IS_AVAILABLE("is Available"),
    TEXT_VERSION("A new version has been released and is now available for download."),
    TEXT_DEV_VERSION("This version is a DEV release."),
    LINK_CHANGELOG("View Changelog"),
    LINK_DOWNLOAD("Download"),
    // Network overview tab
    TITLE_GRAPH_NETWORK_ONLINE_ACTIVITY("Network Online Activity"),
    TITLE_GRAPH_DAY_BY_DAY("Day by Day"),
    UNIT_THE_PLAYERS("Players"),
    TITLE_LAST_24_HOURS("Last 24 hours"),
    TITLE_LAST_7_DAYS("Last 7 days"),
    TITLE_LAST_30_DAYS("Last 30 days"),
    LABEL_UNIQUE_PLAYERS("Unique Players"),
    LABEL_NEW_PLAYERS("New Players"),
    LABEL_REGULAR_PLAYERS("Regular Players"),
    LABEL_TOTAL_PLAYERS("Total Players"),
    TITLE_NETWORK_AS_NUMBERS("Network as Numbers"),
    LABEL_PLAYERS_ONLINE("Players Online"),
    LABEL_TOTAL_PLAYTIME("Total Playtime"),
    LABEL_PLAYTIME("Playtime"),
    LABEL_LAST_PEAK("Last Peak"),
    LABEL_BEST_PEAK("Best Peak"),
    LABEL_AVG_PLAYTIME("Average Playtime"),
    LABEL_PER_PLAYER("/ Player"),
    LABEL_AVG_SESSION_LENGTH("Average Session Length"),
    TITLE_WEEK_COMPARISON("Week Comparison"),
    TITLE_TREND("Trend"),
    COMPARING_7_DAYS("Comparing 7 days"),
    // Servers tab
    LABEL_REGISTERED_PLAYERS("Registered Players"),
    LINK_SERVER_ANALYSIS("Server Analysis"),
    LINK_QUICK_VIEW("Quick view"),
    TITLE_ONLINE_ACTIVITY("Online Activity"),
    TITLE_30_DAYS("30 days"),
    TITLE_AS_NUMBERS("as Numbers"),
    LABEL_AVG_TPS("Average TPS"),
    LABEL_LOW_TPS("Low TPS Spikes"),
    LABEL_DOWNTIME("Downtime"),
    // Sessions tab
    TITLE_RECENT_SESSIONS("Recent Sessions"),
    TITLE_PLAYER("Player"),
    TITLE_SESSION_START("Session Started"),
    TITLE_LENGTH("Length"),
    TITLE_SERVER("Server"),
    TITLE_MOST_PLAYED_WORLD("Most played World"),
    TEXT_CLICK_TO_EXPAND("Click to expand"),
    TITLE_SERVER_PLAYTIME_30("Server Playtime for 30 days"),
    TITLE_INSIGHTS("Insights for 30 days"),
    LABEL_AFK_TIME("AFK Time"),
    LABEL_AFK("AFK"),
    // Playerbase overview tab
    TITLE_PLAYERBASE_DEVELOPMENT("Playerbase development"),
    TITLE_CURRENT_PLAYERBASE("Current Playerbase"),
    TITLE_TRENDS("Trends for 30 days"),
    COMPARING_60_DAYS("Comparing 30d ago to Now"),
    TITLE_30_DAYS_AGO("30 days ago"),
    TITLE_NOW("Now"),
    LABEL_PER_REGULAR_PLAYER("/ Regular Player"),
    LABEL_NEW("New"),
    LABEL_REGULAR("Regular"),
    LABEL_INACTIVE("Inactive"),
    SIDE_TO_MAIN_PAGE("to main page"),
    // Geolocations tab
    TITLE_CONNECTION_INFO("Connection Information"),
    TITLE_COUNTRY("Country"),
    TITLE_AVG_PING("Average Ping"),
    TITLE_WORST_PING("Worst Ping"),
    TITLE_BEST_PING("Best Ping"),
    TEXT_NO_EXTENSION_DATA("No Extension Data"),
    // Server page
    LINK_BACK_NETWORK("Network page"),
    SIDE_PVP_PVE("PvP & PvE"),
    SIDE_PERFORMANCE("Performance"),
    LABEL_RETENTION("New Player Retention"),
    TITLE_SERVER_AS_NUMBERS("Server as Numbers"),
    TITLE_ONLINE_ACTIVITY_AS_NUMBERS("Online Activity as Numbers"),
    COMPARING_15_DAYS("Comparing 15 days"),
    TITLE_GRAPH_PUNCHCARD("Punchcard for 30 Days"),
    LABEL_ONLINE_FIRST_JOIN("Players online on first join"),
    LABEL_FIRST_SESSION_LENGTH("First session length"),
    LABEL_LONE_JOINS("Lone joins"),
    LABEL_LONE_NEW_JOINS("Lone newbie joins"),
    LABEL_MOST_ACTIVE_GAMEMODE("Most Active Gamemode"),
    LABEL_SERVER_OCCUPIED("Server occupied"),
    TITLE_PVP_PVE_NUMBERS("PvP & PvE as Numbers"),
    LABEL_1ST_WEAPON("Deadliest PvP Weapon"),
    LABEL_2ND_WEAPON("2nd PvP Weapon"),
    LABEL_3RD_WEAPON("3rd PvP Weapon"),
    LABEL_AVG_KDR("Average KDR"),
    LABEL_PLAYER_KILLS("Player Kills"),
    LABEL_AVG_MOB_KDR("Average Mob KDR"),
    LABEL_MOB_KILLS("Mob Kills"),
    LABEL_MOB_DEATHS("Mob Caused Deaths"),
    LABEL_DEATHS("Deaths"),
    TITLE_RECENT_KILLS("Recent Kills"),
    TITLE_ALL("All"),
    TITLE_TPS("TPS"),
    TITLE_CPU_RAM("CPU & RAM"),
    TITLE_WORLD("World Load"),
    TITLE_PING("Ping"),
    TITLE_DISK("Disk Space"),
    LABEL_AVG("Average"),
    TITLE_PERFORMANCE_AS_NUMBERS("Performance as Numbers"),
    LABEL_SERVER_DOWNTIME("Server Downtime"),
    LABEL_DURING_LOW_TPS("During Low TPS Spikes:"),
    TEXT_NO_LOW_TPS("No low tps spikes"),
    // Player Page
    TITLE_SEEN_NICKNAMES("Seen Nicknames"),
    LABEL_LAST_SEEN("Last Seen"),
    TITLE_LAST_CONNECTED("Last Connected"),
    LABEL_PLAYER_DEATHS("Player Caused Deaths"),
    TITLE_PVP_KILLS("Recent PvP Kills"),
    TITLE_PVP_DEATHS("Recent PvP Deaths"),
    TITLE_SERVER_PLAYTIME("Server Playtime"),
    LINK_BACK_SERVER("Server page"),
    SIDE_SERVERS_TITLE("SERVERS"),
    // ----------------------------------
    // OLD
    // ----------------------------------
    NAV_PLUGINS("Plugins"),
    PLAYERS_TEXT("Players"),
    TOTAL_PLAYERS("Total Players"),
    UNIQUE_CALENDAR("Unique:"),
    NEW_CALENDAR("New:"),
    LABEL_LOADED_ENTITIES("Loaded Entities"),
    LABEL_LOADED_CHUNKS("Loaded Chunks"),
    LABEL_ENTITIES("Entities"),
    LABEL_FREE_DISK_SPACE("Free Disk Space"),
    ONLINE(" Online"),
    OFFLINE(" Offline"),
    LABEL_TIMES_KICKED("Times Kicked"),
    TOTAL_ACTIVE_TEXT("Total Active"),
    TOTAL_AFK("Total AFK"),
    LABEL_SESSION_MEDIAN("Session Median"),
    LABEL_ACTIVITY_INDEX("Activity Index"),
    INDEX_ACTIVE("Active"),
    INDEX_VERY_ACTIVE("Very Active"),
    INDEX_REGULAR("Regular"),
    INDEX_IRREGULAR("Irregular"),
    INDEX_INACTIVE("Inactive"),
    LABEL_FAVORITE_SERVER("Favorite Server"),
    LABEL_NICKNAME("Nickname"),
    LOCAL_MACHINE("Local Machine"),
    TITLE_CALENDAR(" Calendar"),
    LABEL_SESSION_ENDED("Session Ended"),
    LABEL_SESSION_LENGTH("Session Lenght"),
    LABEL_OPERATOR("Operator"),
    LABEL_BANNED("Banned"),
    LABEL_MOB_KDR("Mob KDR"),
    WITH("<th>With"),
    NO_KILLS("No Kills"),
    ;

    private final String defaultValue;

    HtmlLang(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    @Override
    public String getIdentifier() {
        return "HTML - " + name();
    }

    @Override
    public String getDefault() {
        return defaultValue;
    }

}