export class Booking{
    constructor(
        public roomId:number,
        public guestId:number,
        public checkInDate:any,
        public checkOutDate:any,
        public paymentStatus:boolean
    ){}
}