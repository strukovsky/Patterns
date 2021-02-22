class Singleton private constructor() {

    companion object
    {
        private  var instance: Singleton? = null

        public fun getInstance(): Singleton?
        {
            if(instance == null)
            {
                instance = Singleton()
            }
            return instance
        }
    }
}