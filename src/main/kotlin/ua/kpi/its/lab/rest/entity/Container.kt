import ua.kpi.its.lab.rest.entity.Enterprise

interface Container<T> {
    fun add(element: T)
    fun get(index: Int): T
    fun getAll(): List<T>
    fun update(index: Int, element: T)
    fun remove(index: Int)
}

class EnterpriseContainer : Container<com.example.lab.Enterprise> {
    private val enterprise: MutableList<com.example.lab.Enterprise> = mutableListOf()
    override fun add(element: com.example.lab.Enterprise) {
        enterprise.add(element)
    }

    override fun get(index: Int): com.example.lab.Enterprise {
        return enterprise[index]
    }

    override fun getAll(): List<com.example.lab.Enterprise> {
        return enterprise
    }

    override fun update(index: Int, element: com.example.lab.Enterprise) {
        enterprise[index] = element
    }

    override fun remove(index: Int) {
        enterprise.removeAt(index)
    }
}