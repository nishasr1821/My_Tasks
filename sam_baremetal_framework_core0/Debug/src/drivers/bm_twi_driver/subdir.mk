################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
C_SRCS += \
C:/Users/JIIN05120713/Desktop/framework/drivers/bm_twi_driver/bm_twi.c 

SRC_OBJS += \
./src/drivers/bm_twi_driver/bm_twi.o 

C_DEPS += \
./src/drivers/bm_twi_driver/bm_twi.d 


# Each subdirectory must supply rules for building sources it contributes
src/drivers/bm_twi_driver/bm_twi.o: C:/Users/JIIN05120713/Desktop/framework/drivers/bm_twi_driver/bm_twi.c
	@echo 'Building file: $<'
	@echo 'Invoking: CrossCore ARM Bare Metal C Compiler'
	arm-none-eabi-gcc -g -gdwarf-2 -ffunction-sections -fdata-sections -D_DEBUG -DCORE0 @includes-31ae247f7a5df50ffada24837680fd31.txt -Wall -c -mproc=ADSP-SC589 -msi-revision=1.0 -MMD -MP -MF"src/drivers/bm_twi_driver/bm_twi.d" -o  "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


