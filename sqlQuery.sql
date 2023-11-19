CREATE TABLE IF NOT EXISTS persons (
    id VARCHAR(255) PRIMARY KEY,
    name VARCHAR(255),
    contact_email VARCHAR(255),
    contact_phone VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS cameras (
    id VARCHAR(255) PRIMARY KEY,
    model VARCHAR(255),
    location VARCHAR(255),
    status VARCHAR(50)
);

CREATE TABLE parkings (
    id VARCHAR(255) PRIMARY KEY,
    type VARCHAR(50) NOT NULL,
    name VARCHAR(255),
    geometry_type VARCHAR(50),
    geometry_coordinates_x FLOAT,
    geometry_coordinates_y FLOAT,
	property_type VARCHAR(50),
	property_name VARCHAR(50),
    available_spot_number INT,
    available_spot_observed_at TIMESTAMP WITH TIME ZONE,
    available_spot_reliability FLOAT,
    available_spot_provided_by VARCHAR(255) REFERENCES cameras(id),
    location_type VARCHAR(50),
	location_coordinates_x FLOAT,
    location_coordinates_y FLOAT,
    total_spot_number INT,
    context TEXT[]
);

CREATE TABLE IF NOT EXISTS vehicles (
    id VARCHAR(255) PRIMARY KEY,
    type VARCHAR(50) NOT NULL,
    brand_name VARCHAR(50),
    street_fr VARCHAR(255),
    street_nl VARCHAR(255),
    is_parked_object VARCHAR(255) REFERENCES parkings(id),
    is_parked_observed_at TIMESTAMP WITH TIME ZONE,
    is_parked_provided_by VARCHAR(255) REFERENCES persons(id),
    category VARCHAR(50),
    context TEXT[]
);