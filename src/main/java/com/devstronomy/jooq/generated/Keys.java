/*
 * This file is generated by jOOQ.
 */
package com.devstronomy.jooq.generated;


import com.devstronomy.jooq.generated.tables.Planet;
import com.devstronomy.jooq.generated.tables.Satellite;
import com.devstronomy.jooq.generated.tables.records.PlanetRecord;
import com.devstronomy.jooq.generated.tables.records.SatelliteRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>devstronomy</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<PlanetRecord, Integer> IDENTITY_PLANET = Identities0.IDENTITY_PLANET;
    public static final Identity<SatelliteRecord, Integer> IDENTITY_SATELLITE = Identities0.IDENTITY_SATELLITE;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<PlanetRecord> KEY_PLANET_PRIMARY = UniqueKeys0.KEY_PLANET_PRIMARY;
    public static final UniqueKey<SatelliteRecord> KEY_SATELLITE_PRIMARY = UniqueKeys0.KEY_SATELLITE_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<SatelliteRecord, PlanetRecord> SATELLITE_IBFK_1 = ForeignKeys0.SATELLITE_IBFK_1;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<PlanetRecord, Integer> IDENTITY_PLANET = Internal.createIdentity(Planet.PLANET, Planet.PLANET.ID);
        public static Identity<SatelliteRecord, Integer> IDENTITY_SATELLITE = Internal.createIdentity(Satellite.SATELLITE, Satellite.SATELLITE.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<PlanetRecord> KEY_PLANET_PRIMARY = Internal.createUniqueKey(Planet.PLANET, "KEY_planet_PRIMARY", Planet.PLANET.ID);
        public static final UniqueKey<SatelliteRecord> KEY_SATELLITE_PRIMARY = Internal.createUniqueKey(Satellite.SATELLITE, "KEY_satellite_PRIMARY", Satellite.SATELLITE.ID);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<SatelliteRecord, PlanetRecord> SATELLITE_IBFK_1 = Internal.createForeignKey(com.devstronomy.jooq.generated.Keys.KEY_PLANET_PRIMARY, Satellite.SATELLITE, "satellite_ibfk_1", Satellite.SATELLITE.PLANET_ID);
    }
}
