package com.example.CarRentalSystem.exception.error;

public class ErrorMessage {
    public static final String BRAND_NAME_IS_ALREADY_EXIST = "BrandName has to be unique";
    public static final String BRAND_ID_WAS_NOT_FOUND = "BrandId was not found";
    public static final String BRAND_NAME_WAS_NOT_FOUND = "BrandName was not found";
    public static final String MODEL_NAME_IS_ALREADY_EXIST = "ModelName has to be unique";
    public static final String MODEL_ID_WAS_NOT_FOUND = "ModelId was not found";
    public static final String MODEL_NAME_WAS_NOT_FOUND = "ModelName was not found";
    public static final String SUB_TYPE_NAME_IS_ALREADY_EXIST = "SubTypeName has to be unique";
    public static final String SUB_TYPE_ID_WAS_NOT_FOUND = "SubTypeId was not found";
    public static final String SUB_TYPE_NAME_WAS_NOT_FOUND = "SubTypeName was not found";
    public static final String TYPE_NAME_IS_ALREADY_EXIST = "VehicleTypeName has to be unique";
    public static final String TYPE_ID_WAS_NOT_FOUND = "VehicleTypeId was not found";
    public static final String TYPE_NAME_WAS_NOT_FOUND = "VehicleTypeName was not found";
    public static final String ADDRESS_IS_ALREADY_EXIST = "Address is already exist";
    public static final String BRANCH_NAME_IS_ALREADY_EXIST = "BranchName has to be unique";
    public static final String ADDRESS_ID_WAS_NOT_FOUND = "AddressId was not found";
    public static final String BRANCH_NAME_WAS_NOT_FOUND = "BranchName was not found";
    public static final String BRANCH_ID_WAS_NOT_FOUND = "BranchId was not found";
    public static final String VEHICLE_ID_WAS_NOT_FOUND = "VehicleId was not found";
    public static final String VEHICLE_IS_ALREADY_EXIST = "Vehicle is already exist";
    public static final String BOOKING_IS_ALREADY_EXIST = "Booking with the same parameters is already exist";
    public static final String BOOKING_ID_WAS_NOT_FOUND = "BookingId was not found";
    public static final String BOOKING_CANNOT_BE_CANCELLED = "Booking can't be cancelled";
    public static final String BOOKING_CANNOT_BE_UPDATED = "Booking can't be updated";
    public static final String BOOKING_CANNOT_BE_FINISHED_DUE_STATUS = "Booking can't be finished due to an unsuitable booking status";
    public static final String BOOKING_CANNOT_BE_FINISHED_DUE_DATE = "Booking can't be finished due to the incorrect date of the operation";
    public static final String BOOKING_CANNOT_BE_ACTIVATED_DUE_STATUS = "Booking can't be activated due to an unsuitable booking status";
    public static final String BOOKING_CANNOT_BE_ACTIVATED_DUE_DATE = "Booking can't be activated due to an incorrect activation date";
    public static final String USER_ID_MISMATCH = "Provided user ID does not match the authenticated user's ID";
    public static final String CANNOT_DELETE_BRAND = "Can't delete brand with associated models";
    public static final String CANNOT_DELETE_TYPE = "Can't delete vehicle type with associated subtypes";
}
